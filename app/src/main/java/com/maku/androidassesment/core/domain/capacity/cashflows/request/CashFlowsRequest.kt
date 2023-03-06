package com.maku.androidassesment.core.domain.capacity.cashflows.request

import com.google.gson.annotations.SerializedName

data class CashFlowsRequest(
    @SerializedName("data")
    val `data`: Data
)
