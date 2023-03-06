package com.maku.androidassesment.core.domain.capacity.request

import com.google.gson.annotations.SerializedName

data class CapacityRequest(
    @SerializedName("data")
    val `data`: Data
)
