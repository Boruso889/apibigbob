package com.example.project

import com.google.gson.annotations.SerializedName

data class DishesClass(
    @SerializedName("id")
    val id: Int,

    @SerializedName("category")
    val cat: String,

    @SerializedName("name")
    val namedish: String,

    @SerializedName("description")
    val desc: String,

    @SerializedName("price")
    val pr: Float,

    @SerializedName("img_url")
    val ic: String
)
