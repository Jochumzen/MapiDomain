package com.mapifesto.domain

data class OsmRelationMember(
    val type: String,
    val ref: Long,
    val role: String,
)
