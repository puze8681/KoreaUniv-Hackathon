package com.example.parktaejun.koreaunivhackathon.Server;

import com.example.parktaejun.koreaunivhackathon.Data.Board;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by parktaejun on 2017. 2. 14..
 */

public interface JSONService {
    @FormUrlEncoded
    @POST("/login")
    Call<Board> postBoard(@Field("name") String postName, @Field("title") String postTitle, @Field("context") String postContext, @Field("image") String postImage);
}
