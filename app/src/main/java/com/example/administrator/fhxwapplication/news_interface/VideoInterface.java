package com.example.administrator.fhxwapplication.news_interface;

import com.example.administrator.fhxwapplication.entity.SearchEntity;
import com.example.administrator.fhxwapplication.entity.VideoEntity;
import com.example.administrator.fhxwapplication.utils.ManagerApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/14 0014.
 */
public interface VideoInterface {

    @GET(ManagerApi.VIDEO_JX)
    Call<List<VideoEntity>> getVideoEntity(@Query("page") int page);


    @GET(ManagerApi.VIDEO_OTHER)
    Call<List<VideoEntity>> getVideoOtherEntity(@Query("page") int page
            , @Query("typeid") String typeid);

    @GET(ManagerApi.VIDEO_JX)
    Call<List<SearchEntity>> getTestoEntity(@Query("page") int page);



}
