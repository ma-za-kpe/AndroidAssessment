package com.maku.androidassesment.core.domain.capacity.request


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("capacity_score")
    val capacityScore: Int,
    @SerializedName("debt_to_income_ratio")
    val debtToIncomeRatio: Int,
    @SerializedName("farmer_id")
    val farmerId: String,
    @SerializedName("loan_amount_requested")
    val loanAmountRequested: Int,
    @SerializedName("loan_duration")
    val loanDuration: Int
)