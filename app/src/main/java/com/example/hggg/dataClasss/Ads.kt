package com.example.hggg.dataClasss

import com.google.gson.annotations.SerializedName

data class Ads(
    @SerializedName("data")
    val ads: List<SimpleDataModel>
)