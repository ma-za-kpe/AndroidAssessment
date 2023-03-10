package com.maku.androidassesment.core.domain.capacity.income

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String
)
