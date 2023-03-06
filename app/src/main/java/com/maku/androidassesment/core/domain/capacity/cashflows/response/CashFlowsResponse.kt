package com.maku.androidassesment.core.domain.capacity.cashflows.response

import com.google.gson.annotations.SerializedName

data class CashFlowsResponse(
    @SerializedName("data")
    val `data`: Data
)
