package com.maku.androidassesment.core.domain.farmer.response

import com.google.gson.annotations.SerializedName

data class FarmerResponse(
    @SerializedName("data")
    val `data`: Data
)
