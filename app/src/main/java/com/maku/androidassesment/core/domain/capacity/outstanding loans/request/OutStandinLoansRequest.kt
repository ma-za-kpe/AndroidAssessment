package com.maku.androidassesment.core.domain.capacity.outstanding loans.request


import com.google.gson.annotations.SerializedName

data class OutStandinLoansRequest(
    @SerializedName("data")
    val `data`: Data
)