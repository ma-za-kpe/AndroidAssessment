package com.maku.androidassesment.core.domain.capacity.income.response

import com.google.gson.annotations.SerializedName

data class IncomeResponse(
    @SerializedName("data")
    val `data`: Data
)
