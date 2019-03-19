package com.example.administrator.fhxwapplication.news_interface;


import com.example.administrator.fhxwapplication.entity.LiveChannelEntity;
import com.example.administrator.fhxwapplication.entity.LiveContentEntity;
import com.example.administrator.fhxwapplication.utils.ManagerApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by RealMo on 2019-03-18.
 */
public interface LiveInterface {

    @GET(ManagerApi.LIVE_CONTENT)
    Call<List<LiveContentEntity>> getLiveContent(@Query("page") int page);

    @GET(ManagerApi.LIVE_CHANNEL)
    Call<LiveChannelEntity> getLiveChannel();

    @GET(ManagerApi.LIVE_CONTENT)
    Call<String> getLiveContentString(@Query("page") int page);
}
