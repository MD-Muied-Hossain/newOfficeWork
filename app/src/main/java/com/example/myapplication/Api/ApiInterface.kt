package com.example.myapplication.Api

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("3/movie/now_playing?api_key=19c1c2d504f8ac3c45453893ebb0e54d&language=en-US&page=3")
    fun getData(): Call<responseDataClass>

}