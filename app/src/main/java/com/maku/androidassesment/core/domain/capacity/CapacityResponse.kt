package com.maku.androidassesment.core.domain.capacity

import com.google.gson.annotations.SerializedName

data class CapacityResponse(
    @SerializedName("data")
    val `data`: Data
)
