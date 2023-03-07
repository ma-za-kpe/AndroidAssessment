package com.maku.androidassesment.core.domain.capacity.year

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("cashflows_id")
    val cashflowsId: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("title")
    val title: Int,
    @SerializedName("updated_at")
    val updatedAt: String
)
