package com.example.countriesapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countriesapp.api.CountriesAPI
import com.example.countriesapp.api.RetrofitInstance
import com.example.countriesapp.models.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CountryListViewModel : ViewModel() {
    var liveDataList: MutableLiveData<List<Country>?> = MutableLiveData()

    fun getLiveDataObserver(): MutableLiveData<List<Country>?> {
        return liveDataList
    }

    fun makeAPICall() {
        val retroInstance = RetrofitInstance.getRetrofitInstance()
        val retroService = retroInstance.create(CountriesAPI::class.java)
        val call = retroService.getCountryList()
        call.enqueue(object : Callback<List<Country>> {
            override fun onFailure(call: Call<List<Country>>, t: Throwable) {
                liveDataList.postValue(null)
            }

            override fun onResponse(call: Call<List<Country>>, response: Response<List<Country>>) {
                liveDataList.postValue(response.body())
            }
        })
    }
}