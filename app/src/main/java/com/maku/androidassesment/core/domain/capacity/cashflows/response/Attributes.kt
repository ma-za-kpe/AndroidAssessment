package com.maku.androidassesment.core.domain.capacity.cashflows.response

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("capacity_id")
    val capacityId: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
)
