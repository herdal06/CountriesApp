package com.example.countriesapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.countriesapp.R
import com.example.countriesapp.adapters.CountryAdapter
import com.example.countriesapp.ui.viewmodel.CountryListViewModel
import kotlinx.android.synthetic.main.fragment_country_list.*


class CountryListFragment : Fragment() {

    private lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupRecyclerView()
        setupViewModel()

    }

    private fun setupViewModel() {
        val viewModel: CountryListViewModel = ViewModelProvider(this).get(CountryListViewModel::class.java)
        viewModel.getLiveDataObserver().observe(this, Observer {
            if(it != null) {
                adapter.setCountryList(it)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(requireContext(),"Error", Toast.LENGTH_LONG).show()
            }
        })
        viewModel.makeAPICall()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = CountryAdapter(requireActivity())
        recyclerView.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}