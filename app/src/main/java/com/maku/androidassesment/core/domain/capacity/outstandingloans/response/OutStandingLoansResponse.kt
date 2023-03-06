package com.maku.androidassesment.core.domain.capacity.outstandingloans.response

import com.google.gson.annotations.SerializedName

data class OutStandingLoansResponse(
    @SerializedName("data")
    val `data`: Data
)
