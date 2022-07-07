package com.mapifesto.domain

data class MapboxSearchSuggestion(
    val id: String,
    val name: String,
    val descriptionText: String?,
    val country: String?,
    val region: String?,
    val postcode: String?,
    val district: String?,
    val place: String?,
    val locality: String?,
    val neighborhood: String?,
    val street: String?,
    val houseNumber: String?,
    val distanceMeters: Double?
)
