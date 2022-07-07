package com.mapifesto.domain

class OverpassNode(
    override val id: Long,
    override val location: LatLon,
    override val tags: OsmTags,
    override val osmElementType: OsmElementType,
): OverpassElement {

    override fun tags(): OsmTags = tags

    override fun id(): Long = id

    override fun location(): LatLon = location

    override fun osmElementType(): OsmElementType = OsmElementType.NODE
}