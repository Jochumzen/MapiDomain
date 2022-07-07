package com.mapifesto.domain

enum class WikipediaType{
    NONE, EN, SV
}

data class Wikipedia(
    val url: String,
    val type: WikipediaType,
)
