package com.maku.androidassesment.core.domain.capacity.outstanding loans.request


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("type")
    val type: String
)