package com.maku.androidassesment.core.domain.farmer.request

import com.google.gson.annotations.SerializedName

data class FarmerRequest(
    @SerializedName("data")
    val `data`: Data
)
