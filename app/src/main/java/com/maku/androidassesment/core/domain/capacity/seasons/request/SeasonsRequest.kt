package com.maku.androidassesment.core.domain.capacity.seasons.request


import com.google.gson.annotations.SerializedName

data class SeasonsRequest(
    @SerializedName("data")
    val `data`: Data
)