package com.example.parktaejun.koreaunivhackathon.Server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by parktaejun on 2017. 2. 14..
 */

public class Util {
    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("localhost")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();
    public static final String TAG = "hello";
}