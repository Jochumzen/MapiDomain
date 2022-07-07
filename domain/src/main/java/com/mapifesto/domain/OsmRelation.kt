package com.mapifesto.domain

import com.mapifesto.domain.OsmTags

data class OsmRelation(
    val id: Long,
    val version: Int,
    val tags: OsmTags,
    val members: List<OsmRelationMember>,
)
