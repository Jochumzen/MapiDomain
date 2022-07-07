package com.mapifesto.domain

data class MapboxReverseSearchResult(
    val type: String,
    val place: String?,
    val houseNumber: String?,
    val street: String?,
    val neighborhood: String?,
    val locality: String?,
    val postcode: String?,
    val district: String?,
    val region: String?,
    val country: String?,
    val names: List<String>? = null,
    val languages: List<String>? = null,
    val descriptionAddress: String? = null,
    val distanceMeters: Double? = null,
    val categories: List<String>? = null,

)