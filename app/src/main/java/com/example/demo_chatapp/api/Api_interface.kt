package com.example.demo_chatapp.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api_interface {

    // http://apilayer.net/api/live?access_key=843d4d34ae72b3882e3db642c51e28e6&currencies=VND&source=USD&format=1
    @GET("live")
    fun getData(
        @Query("access_key") access_key: String,
        @Query("format") format: Int,
        @Query("currencies") currencies: String,
        @Query("source") source: String
    ): Call<My_Data>
    @GET("live?access_key=843d4d34ae72b3882e3db642c51e28e6&currencies=VND&source=USD&format=1")
    fun getData1()
}