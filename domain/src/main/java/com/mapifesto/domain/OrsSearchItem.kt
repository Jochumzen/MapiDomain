package com.mapifesto.domain

data class OrsSearchItem(
    val id: String,
    val gid: String?,
    val name: String,
    val latLon: LatLon,
    val country: String?,
    val locality: String?,
    val city: String?,
    val region: String?,
    val county: String?,
    val wikiId: String?,
    val layer: String?,
    val street: String?,
    val houseNumber: String?,
)
