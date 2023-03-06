package com.maku.androidassesment.core.domain.capacity.outstandingloans.request

import com.google.gson.annotations.SerializedName

data class OutStandingLoansRequest(
    @SerializedName("data")
    val `data`: Data
)
