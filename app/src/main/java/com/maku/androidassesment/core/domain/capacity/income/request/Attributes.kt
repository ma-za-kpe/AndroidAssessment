package com.maku.androidassesment.core.domain.capacity.income.request


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("capacity_id")
    val capacityId: String,
    @SerializedName("job_title")
    val jobTitle: String,
    @SerializedName("salary")
    val salary: Int
)