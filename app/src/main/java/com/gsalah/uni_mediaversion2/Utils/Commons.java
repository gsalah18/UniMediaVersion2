package com.gsalah.uni_mediaversion2.Utils;

import com.gsalah.uni_mediaversion2.Commands.APIClient;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Commons {
    public static String ServerIP="192.168.0.111";

    public static String GetDgreePrefix(String degree)
    {
        return degree.equalsIgnoreCase("doctor")?"Dr.":degree.equalsIgnoreCase("master")?"I.":"";
    }

    private static Retrofit retrofit;

    public static APIClient getAPIClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ServerIP)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .build();
        }
        return retrofit.create(APIClient.class);
    }
}
