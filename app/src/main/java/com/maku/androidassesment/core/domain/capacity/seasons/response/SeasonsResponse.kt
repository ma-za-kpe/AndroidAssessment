package com.maku.androidassesment.core.domain.capacity.seasons.response


import com.google.gson.annotations.SerializedName

data class SeasonsResponse(
    @SerializedName("data")
    val `data`: Data
)