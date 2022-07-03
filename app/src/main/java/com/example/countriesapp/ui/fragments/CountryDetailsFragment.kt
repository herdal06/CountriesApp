package com.example.countriesapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.countriesapp.R
import com.example.countriesapp.models.Country
import com.example.countriesapp.ui.viewmodel.CountryDetailsViewModel
import kotlinx.android.synthetic.main.fragment_country_details.*


class CountryDetailsFragment : Fragment() {

    private lateinit var viewModel: CountryDetailsViewModel
    private val args: CountryDetailsFragmentArgs by navArgs()
    private lateinit var country: Country

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        country = args.country
        populateUI()
    }

    private fun populateUI() {
        textViewCountryNameDetails.text = "Name : "+country.name
        textViewCountryAlpha2CodeDetails.text = "Alpha2 Code : "+country.alpha2Code
        textViewCountryNativeNameDetails.text = "Native Name : "+country.nativeName
        textViewCountryCapitalDetails.text = "Capital City : "+country.capital
        textViewCountryRegionDetails.text = "Region : "+country.region
        textViewCountrySubregionDetails.text = "Subregion : "+country.subregion
        textViewCountryPopulationDetails.text = "Population : "+country.population

    }
}