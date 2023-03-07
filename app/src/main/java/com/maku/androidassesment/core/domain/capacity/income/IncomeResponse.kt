package com.maku.androidassesment.core.domain.capacity.income

import com.google.gson.annotations.SerializedName

data class IncomeResponse(
    @SerializedName("data")
    val `data`: Data
)
