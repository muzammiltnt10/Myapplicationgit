package com.example.muzammil.myapplicationgit;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit = null;
    private static Context sContext;

    public static Retrofit getClient(Context context) {
        sContext = context;
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(httpClient)
                    .baseUrl(WodrobApiConstant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        Log.v("Access Token","" + SharedPreferencesHelper.getInstance().getString(SharedPreferencesHelper.Key.ACCESS_TOKEN));
        return retrofit;
    }

    static OkHttpClient httpClient = new OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
            Request.Builder ongoing = chain.request().newBuilder();
            String bearer = SharedPreferencesHelper.getInstance().getString(SharedPreferencesHelper.Key.ACCESS_TOKEN);
            ongoing.addHeader("Authorization", "Bearer " + bearer);
            ongoing.addHeader("Content-type", "application/x-www-form-urlencoded");
            return chain.proceed(ongoing.build());
                }
    }
    ).build();
}