package com.example.administrator.fhxwapplication.news_interface;

import com.example.administrator.fhxwapplication.entity.NewsSportEntity;
import com.example.administrator.fhxwapplication.entity.NewsTopEntity;
import com.example.administrator.fhxwapplication.utils.ManagerApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by RealMo on 2016-12-11.
 */
public interface NewsInterface {

    @GET(ManagerApi.NEWS_TOP)
    Call<List<NewsTopEntity>> getTopEntity(@Query("action") String action);

    @GET(ManagerApi.NEWS_SPORT)
    Call<List<NewsSportEntity>> getSportEntity(@Query("page") int page);
}
