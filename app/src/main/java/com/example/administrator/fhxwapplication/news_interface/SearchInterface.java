package com.example.administrator.fhxwapplication.news_interface;

import com.example.administrator.fhxwapplication.entity.SearchEntity;
import com.example.administrator.fhxwapplication.utils.ManagerApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/14 0014.
 */
public interface SearchInterface {


    @GET(ManagerApi.SEARCH_CONTENT)
    Call<SearchEntity> getTest(@Query("page") int page,
                               @Query("k") String k);
}
