package com.example.meridiatask.services

import com.example.meridiatask.models.Feature
import retrofit2.Call
import retrofit2.http.GET

interface FeatureService {
    @GET("features")
    fun getFeatureList () : Call<List<Feature>>
}