package com.example.countriesapp.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Flags(
    @SerializedName("png")
    val png: String?,
    @SerializedName("svg")
    val svg: String?,
): Parcelable