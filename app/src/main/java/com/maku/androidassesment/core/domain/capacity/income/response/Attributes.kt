package com.maku.androidassesment.core.domain.capacity.income.response


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("capacity_id")
    val capacityId: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("job_title")
    val jobTitle: String,
    @SerializedName("salary")
    val salary: Int,
    @SerializedName("updated_at")
    val updatedAt: String
)