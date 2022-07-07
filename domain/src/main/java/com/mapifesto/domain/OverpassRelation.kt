package com.mapifesto.domain

class OverpassRelation(
    override val id: Long,
    override val location: LatLon,
    override val tags: OsmTags,
    override val osmElementType: OsmElementType,
    val members: List<OsmRelationMember>

): OverpassElement {
    override fun tags(): OsmTags = tags

    override fun id(): Long = id

    override fun location(): LatLon = location

    override fun osmElementType(): OsmElementType = OsmElementType.RELATION

}