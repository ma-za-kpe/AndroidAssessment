package com.maku.androidassesment.core.domain.capacity.seasons

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("expenses")
    val expenses: String,
    @SerializedName("income")
    val income: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("net")
    val net: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("year_id")
    val yearId: String
)
