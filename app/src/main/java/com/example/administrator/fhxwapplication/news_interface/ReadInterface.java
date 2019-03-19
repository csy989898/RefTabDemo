package com.example.administrator.fhxwapplication.news_interface;

import com.example.administrator.fhxwapplication.entity.ReadContentEntity;
import com.example.administrator.fhxwapplication.utils.ManagerApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
public interface ReadInterface {

    @GET(ManagerApi.FIND_YOULIKE)
    Call<ReadContentEntity> getReadContent(@Query("action") String action);
}
