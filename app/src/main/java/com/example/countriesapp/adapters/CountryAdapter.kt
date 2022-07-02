package com.example.countriesapp.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countriesapp.R
import com.example.countriesapp.databinding.ItemCountryRowBinding
import com.example.countriesapp.models.Country
import kotlinx.android.synthetic.main.item_country_row.view.*

class CountryAdapter() :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    private var countryList: List<Country>? = null

    fun setCountryList(countryList: List<Country>?) {
        this.countryList = countryList
    }

    inner class CountryViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val flagImage = view.imageViewRecyclerRowFlag
        val name = view.textViewRecyclerRowCountryName
        val capital = view.textViewRecyclerRowCapitalCity
        val region = view.textViewRecyclerRowCountryRegion

        fun bind(country: Country) {
            name.text = country.name + "(" + country.alpha2Code + ")"
            capital.text = "Capital : " + country.capital
            region.text = "Region : " + country.region
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_country_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryList?.get(position)!!)
    }

    override fun getItemCount(): Int {
        if (countryList == null) return 0
        else return countryList?.size!!
    }
}