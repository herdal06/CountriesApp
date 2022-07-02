package com.example.countriesapp.api

import com.example.countriesapp.models.Country
import retrofit2.Call
import retrofit2.http.GET

interface CountriesAPI {
    @GET("v2/all")
    fun getCountryList(): Call<List<Country>>
}