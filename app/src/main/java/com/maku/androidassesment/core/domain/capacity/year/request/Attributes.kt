package com.maku.androidassesment.core.domain.capacity.year.request


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("cashflows_id")
    val cashflowsId: String,
    @SerializedName("title")
    val title: Int
)