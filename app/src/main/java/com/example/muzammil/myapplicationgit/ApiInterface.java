package com.example.muzammil.myapplicationgit;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    /**
     * The very first step needs to be done when the app is launched ie. register the device
     * with the backend and then proceed further
     *
     * @param clientId            of the patron
     * @param clientSecret        of the patron
     * @param uuid                of the device
     * @param deviceType          of the device ie. android or iOS
     * @param modelNo             of the device
     * @param appVersion          version of the app
     * @param pushNotificationKey fcm token obtained from the google see
     * @param deviceOs            version of the device
     * @return {@link DeviceRegistrationModel } if registration is successful
     */


    @POST(ApiConstant.DEVICE_REGISTER)
    Call<DeviceRegistrationModel> registerFCMToken(@Query("client_id") String clientId,
                                                   @Query("client_secret") String clientSecret,
                                                   @Query("uuid") String uuid,
                                                   @Query("device_type") String deviceType,
                                                   @Query("model_number") String modelNo,
                                                   @Query("app_version") String appVersion,
                                                   @Query("push_notification_key") String pushNotificationKey,
                                                   @Query("device_os") String deviceOs);
    @POST(ApiConstant.MASTERS_SYNC)
    Call<MastersModel> getMastersData(@Header("Authorization") String header, @Query("client_id") String clientId,
                                      @Query("client_secret") String clientSecret);

}
