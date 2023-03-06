package com.maku.androidassesment.core.domain.capacity.income.request


import com.google.gson.annotations.SerializedName

data class IncomeRequest(
    @SerializedName("data")
    val `data`: Data
)