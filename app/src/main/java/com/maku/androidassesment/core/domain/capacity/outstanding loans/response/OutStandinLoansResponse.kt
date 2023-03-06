package com.maku.androidassesment.core.domain.capacity.outstanding loans.response


import com.google.gson.annotations.SerializedName

data class OutStandinLoansResponse(
    @SerializedName("data")
    val `data`: Data
)