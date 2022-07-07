package com.mapifesto.domain

class OverpassWay(
    override val id: Long,
    override val location: LatLon,
    override val tags: OsmTags,
    val nodes: List<Long>,
    override val osmElementType: OsmElementType,

    ): OverpassElement {

    override fun tags(): OsmTags = tags

    override fun id(): Long = id

    override fun location(): LatLon = location

    override fun osmElementType(): OsmElementType = OsmElementType.WAY

}