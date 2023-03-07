package com.maku.androidassesment.core.domain.capacity.year

import com.google.gson.annotations.SerializedName

data class YearResponse(
    @SerializedName("data")
    val `data`: Data
)
