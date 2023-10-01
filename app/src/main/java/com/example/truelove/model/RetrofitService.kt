package com.example.truelove.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    var retroFit = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    var api = retroFit.create(LoveApi::class.java)
}