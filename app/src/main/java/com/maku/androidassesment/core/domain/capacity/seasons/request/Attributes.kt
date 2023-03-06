package com.maku.androidassesment.core.domain.capacity.seasons.request

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("expenses")
    val expenses: String,
    @SerializedName("income")
    val income: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("net")
    val net: String,
    @SerializedName("year_id")
    val yearId: String
)
