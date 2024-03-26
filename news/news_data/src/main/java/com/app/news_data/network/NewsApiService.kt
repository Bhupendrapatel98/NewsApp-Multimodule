package com.app.news_data.network

import com.app.common_utills.Constant
import com.app.news_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String = Constant.COUNTRY,
        @Query("category") category: String = Constant.CATEGORY,
        @Query("apiKey") apiKey: String = Constant.API_KEY,
    ): NewsResponse
}