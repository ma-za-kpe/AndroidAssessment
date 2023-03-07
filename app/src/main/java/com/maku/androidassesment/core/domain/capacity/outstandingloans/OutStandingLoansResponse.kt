package com.maku.androidassesment.core.domain.capacity.outstandingloans

import com.google.gson.annotations.SerializedName

data class OutStandingLoansResponse(
    @SerializedName("data")
    val `data`: Data
)
