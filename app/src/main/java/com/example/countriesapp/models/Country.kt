package com.example.countriesapp.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Country(
    @SerializedName("name")
    val name: String?,
    @SerializedName("flag")
    val flag: String?,
    @SerializedName("alpha2Code")
    val alpha2Code: String?,
    @SerializedName("capital")
    val capital: String?,
    @SerializedName("region")
    val region: String?,
    @SerializedName("flags")
    val flags: Flags?
)