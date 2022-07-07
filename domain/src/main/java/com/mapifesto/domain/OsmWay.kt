package com.mapifesto.domain


data class OsmWay(
    val id: Long,
    val version: Int,
    val tags: OsmTags,
    val nodes: List<Long>,
)
