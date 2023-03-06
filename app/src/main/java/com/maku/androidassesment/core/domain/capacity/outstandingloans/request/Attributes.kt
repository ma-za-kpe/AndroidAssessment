package com.maku.androidassesment.core.domain.capacity.outstandingloans.request

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("bank_name")
    val bankName: String,
    @SerializedName("capacity_id")
    val capacityId: String
)
