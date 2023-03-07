package com.maku.androidassesment.core.domain.capacity.cashflows

import com.google.gson.annotations.SerializedName

data class CashFlowsResponse(
    @SerializedName("data")
    val `data`: Data
)
