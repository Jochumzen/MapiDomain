package com.mapifesto.domain

data class OsmNode(
    val id: Long,
    val location: LatLon,
    val version: Int,
    val tags: OsmTags,
)
