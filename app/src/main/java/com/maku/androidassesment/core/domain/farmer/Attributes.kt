package com.maku.androidassesment.core.domain.farmer

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("farm_name")
    val farmName: String,
    @SerializedName("farm_size")
    val farmSize: Int,
    @SerializedName("farm_type")
    val farmType: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("location")
    val location: String,
    @SerializedName("national_id")
    val nationalId: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("updated_at")
    val updatedAt: String
)
