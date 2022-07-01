package com.example.countriesapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countriesapp.databinding.ItemCountryRowBinding
import com.example.countriesapp.models.Country

class CountryAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    inner class CountryViewHolder(private val binding: ItemCountryRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(country: Country) {
            itemView.apply {
                Glide.with(this).load(country.flag).into(binding.imageViewRecyclerRowFlag)
                binding.textViewRecyclerRowCountryName.text = country.name
                binding.textViewRecyclerRowCapitalCity.text = country.capital
                binding.textViewRecyclerRowCountryRegion.text = country.region
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(
            ItemCountryRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countryList[position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}