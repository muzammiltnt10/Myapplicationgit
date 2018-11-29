package com.example.muzammil.myapplicationgit;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Response;
import com.google.firebase.iid.FirebaseInstanceId;

import java.io.File;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key.ACCESS_TOKEN;
import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key.DEVICE_TYPE;
import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key.PATRON_ID;
import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key.PUSH_NOTIFICATION_KEY;
import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key.TOKEN_SENT_TO_SERVER;
import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key.UUID;
import static com.example.muzammil.myapplicationgit.SharedPreferencesHelper.Key._ID;

public class MainActivity extends AppCompatActivity {
    final Handler handler = new Handler();
    private ImageView mBackgroundImage;
    private TextView mAppNameText;
    private TextView mMessageText;
    private SharedPreferencesHelper sharedPreferencesHelper;
    private Call<DeviceRegistrationModel> mDeviceRegistrationCall;
    private ApiInterface mApiInterface;
    private Call<MastersModel> mMasterDataCall;
    Runnable checkNetworkConnection =   new Runnable() {
        @Override
        public void run() {
            getMasterData();

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferencesHelper = SharedPreferencesHelper.getInstance(getApplicationContext());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mMessageText = (TextView) findViewById(R.id.tv_spinner_message);
        mApiInterface = ApiClient.getClient(getApplicationContext()).create(ApiInterface.class);
        mBackgroundImage = (ImageView) findViewById(R.id.im_background);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(mBackgroundImage);
        Glide.with(getApplicationContext()).load(R.raw.gifloader_white).error(R.drawable.ep_no_image).into(imageViewTarget);



        if (sharedPreferencesHelper.getBoolean(TOKEN_SENT_TO_SERVER, false)) {
            getMasterData();
        } else {
            if (Wodrob.isNetConnected(getApplicationContext())) {
                gcmRegistration();
            } else {
                //Glide.with(getApplicationContext()).load(R.drawable.logo).into(mBackgroundImage);
                startCheckingNetWorkAvailability();
            }
        }

        File file = new File(Environment.getExternalStorageDirectory() + File.separator + Wodrob.DIRECTORY_NAME);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    private void startCheckingNetWorkAvailability() {
        mMessageText.setText(R.string.internet_is_not_available);
        handler.postDelayed(checkNetworkConnection, 1000);
    }

    private void gcmRegistration() {
        if (checkPlayServices()) {
            mMessageText.setText("please wait");

            mDeviceRegistrationCall = mApiInterface.registerFCMToken(
                    WodrobApiConstant.client_id,
                    WodrobApiConstant.client_secret,
                    Wodrob.getUuid(getApplicationContext()),
                    Wodrob.isTablet(getApplication()),
                    Wodrob.getDeviceName(), Wodrob.getAppVersion(getApplicationContext()),
                    FirebaseInstanceId.getInstance().getToken(),
                    android.os.Build.VERSION.RELEASE);

            mDeviceRegistrationCall.enqueue(new Callback<DeviceRegistrationModel>() {
                @Override
                public void onResponse(Call<DeviceRegistrationModel> call, retrofit2.Response<DeviceRegistrationModel> response) {
                    if (response.isSuccessful()) {

                        DeviceRegistrationModel data = response.body();


                        SharedPreferencesHelper.getInstance().put(TOKEN_SENT_TO_SERVER, true);

                        try {
                            SharedPreferencesHelper.getInstance().put(_ID, data.device._id);
                            SharedPreferencesHelper.getInstance().put(PATRON_ID, data.device.patron_id);
                            SharedPreferencesHelper.getInstance().put(UUID, data.device.uuid);
                            SharedPreferencesHelper.getInstance().put(DEVICE_TYPE, data.device.device_type);
                            SharedPreferencesHelper.getInstance().put(PUSH_NOTIFICATION_KEY, data.device.push_notification_key);
                            SharedPreferencesHelper.getInstance().put(ACCESS_TOKEN, data.token.access_token);

                        } catch (Exception e) {
                            e.printStackTrace();

                        }

                        getMasterData();
                    } else {

                        SharedPreferencesHelper.getInstance().put(TOKEN_SENT_TO_SERVER, false);
                    }
                }



                @Override
                public void onFailure(Call<DeviceRegistrationModel> call, Throwable t) {

                    SharedPreferencesHelper.getInstance().put(TOKEN_SENT_TO_SERVER, false);
                }
            });
        }
    }
    private boolean checkPlayServices() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                apiAvailability.getErrorDialog(this, resultCode, ApiConstant.Constants.PLAY_STORE_SERVICES).show();
            } else {
                Toast.makeText(getApplicationContext(), R.string.this_device_is_not_supported, Toast.LENGTH_LONG).show();
                finish();
            }
            return false;
        }
        return true;
    }

    private void getMasterData() {
        if (Wodrob.isNetConnected(MainActivity.this)) {

            handler.removeCallbacks(checkNetworkConnection);
            mMasterDataCall = mApiInterface.getMastersData("",
                    WodrobApiConstant.client_id,
                    WodrobApiConstant.client_secret);
            mMessageText.setText(R.string.fetching_data);
            mMasterDataCall.enqueue(new Callback<MastersModel>() {
                @Override
                public void onResponse(Call<MastersModel> call, retrofit2.Response<MastersModel> response) {
                    if (response.isSuccessful() && response.body().data != null) {
                        insertData(response.body().data);
                    }
                }

                @Override
                public void onFailure(Call<MastersModel> call, Throwable t) {

                }
            });
        } else {
            startCheckingNetWorkAvailability();
        }
    }

    private void insertData(MastersModel data) {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mDeviceRegistrationCall != null)
            mDeviceRegistrationCall.cancel();

        if (mMasterDataCall != null)
            mMasterDataCall.cancel();
    }

}

