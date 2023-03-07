package com.maku.androidassesment.core.domain.capacity.seasons

import com.google.gson.annotations.SerializedName

data class SeasonsResponse(
    @SerializedName("data")
    val `data`: Data
)
