package com.mapifesto.domain

data class UserDetails(
    val id: Long,
    val displayName: String,
    val imgUrl: String,
    val changesets: Int,
)
