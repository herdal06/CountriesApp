package com.example.countriesapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countriesapp.models.Country

class CountryDetailsViewModel : ViewModel() {
    val countryLiveData = MutableLiveData<Country>()
}