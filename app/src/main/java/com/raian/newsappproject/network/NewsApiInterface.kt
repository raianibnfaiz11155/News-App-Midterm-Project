package com.raian.newsappproject.network

import com.raian.newsappproject.models.NewsDatAaSource
import com.raian.newsappproject.utils.Constants.Companion.API_KEY
import com.raian.newsappproject.utils.Constants.Companion.BASE_URL
import com.raian.newsappproject.utils.Constants.Companion.BUSINESS
import com.raian.newsappproject.utils.Constants.Companion.ENTERTAINMENT
import com.raian.newsappproject.utils.Constants.Companion.HEALTH
import com.raian.newsappproject.utils.Constants.Companion.SCIENCE
import com.raian.newsappproject.utils.Constants.Companion.SPORTS
import com.raian.newsappproject.utils.Constants.Companion.TECHNOLOGY
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL)
        .build()

interface NewsApiInterface {
    @GET("${BUSINESS}${API_KEY}")
    suspend fun getBusiness(): NewsDatAaSource

    @GET("${SPORTS}${API_KEY}")
    suspend fun getSports(): NewsDatAaSource

    @GET("${SCIENCE}${API_KEY}")
    suspend fun getScience(): NewsDatAaSource

    @GET("${TECHNOLOGY}${API_KEY}")
    suspend fun getTechnology(): NewsDatAaSource

    @GET("${HEALTH}${API_KEY}")
    suspend fun getHealth(): NewsDatAaSource

    @GET("${ENTERTAINMENT}${API_KEY}")
    suspend fun getEntertainment(): NewsDatAaSource
}

object NewsApi {
    val retrofitService: NewsApiInterface by lazy { retrofit.create(NewsApiInterface::class.java) }
}