package com.mapifesto.domain

data class OsmTag(
    val key: String,
    val value: String,
) {
    fun setValue(newValue: String): OsmTag {
        return OsmTag(
            key = key,
            value = newValue,
        )
    }
}
