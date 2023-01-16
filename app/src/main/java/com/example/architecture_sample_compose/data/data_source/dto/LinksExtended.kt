package com.example.architecture_sample_compose.data.data_source.dto


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("stats")
    val stats: Stats,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)