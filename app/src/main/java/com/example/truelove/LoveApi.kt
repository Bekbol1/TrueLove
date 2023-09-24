package com.example.truelove

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    //"https://love-calculator.p.rapidapi.com/getPercentage?sname=Alice&fname=John"
    //.addHeader("X-RapidAPI-Key", "12f672b732msh413e8147ef4ab95p100101jsn1952cb47ec57")
    //.addHeader("X-RapidAPI-Host", "love-calculator.p.rapidapi.com")
    @GET("getPercentage")
    fun countCompatibility(@Query("fname") firstName: String,
                           @Query ("sname") secondName: String,
                           @Header("X-RapidAPI-Key") key: String = "12f672b732msh413e8147ef4ab95p100101jsn1952cb47ec57",
                           @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com",
                           ): Call<LoveModel>
}