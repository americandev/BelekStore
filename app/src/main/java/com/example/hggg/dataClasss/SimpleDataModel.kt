package com.example.hggg.dataClasss

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SimpleDataModel (

    @SerializedName("Id") val id : String,
    @SerializedName("url") val url : String,
    @SerializedName("avito_id") val avito_id : String,
    @SerializedName("title") val title : String,
    @SerializedName("price") val price : String,
    @SerializedName("time") val time : String,
    @SerializedName("operator") val operator : String,
    @SerializedName("phone") val phone : String,
    @SerializedName("name") val name : String,
    @SerializedName("region") val region : String,
    @SerializedName("city") val city : String,
    @SerializedName("district") val district : String,
    @SerializedName("address") val address : String,
    @SerializedName("metro") val metro : String,
    @SerializedName("images") val images : String,
    @SerializedName("description") val description : String,
    @SerializedName("category_Id") val category_Id : String,
    @SerializedName("subcategory_Id") val subcategory_Id : String,
    @SerializedName("region_Id") val region_Id : String,
    @SerializedName("city_Id") val city_Id : String,
    @SerializedName("marka") val marka : String,
    @SerializedName("model") val model : String,
    @SerializedName("engine_vol") val engine_vol : String,
    @SerializedName("transmission") val transmission : String,
    @SerializedName("year") val year : String,
    @SerializedName("body") val body : String,
    @SerializedName("images_big") val images_big : String,
    @SerializedName("postfix") val postfix : String,
    @SerializedName("other") val other : List<String>
): Parcelable