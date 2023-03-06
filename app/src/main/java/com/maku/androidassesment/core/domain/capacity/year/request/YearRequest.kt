package com.maku.androidassesment.core.domain.capacity.year.request

import com.google.gson.annotations.SerializedName

data class YearRequest(
    @SerializedName("data")
    val `data`: Data
)
