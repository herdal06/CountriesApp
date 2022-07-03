package com.example.countriesapp.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
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
    @SerializedName("subregion")
    val subregion: String?,
    @SerializedName("population")
    val population: String?,
    @SerializedName("nativeName")
    val nativeName: String?,
    @SerializedName("flags")
    val flags: Flags?
) : Parcelable