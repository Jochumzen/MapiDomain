package com.mapifesto.domain

interface OverpassElement {

    val id: Long
    val location: LatLon
    val tags: OsmTags
    val osmElementType: OsmElementType

    fun tags(): OsmTags

    fun id(): Long

    fun location(): LatLon

    fun osmElementType(): OsmElementType
}

