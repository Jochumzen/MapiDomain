package com.mapifesto.domain

import ch.poole.openinghoursparser.Rule

data class OsmTags(
    val tags: Map<String,String>
) {

    val name get(): String = tags["name"]?: "Unknown name"

    val typeAsString get(): String {
        val osmType = OsmType.createFromTags(tags)
        return osmType.errorMessage ?: osmType.nameEn
    }

    val type get(): OsmType? {
        val osmType = OsmType.createFromTags(tags)
        return if(osmType.errorMessage == null) osmType else null
    }

    val openingHoursAsString get(): String = tags["opening_hours"]?: "This element has no opening hours"

    val openingRules get(): OpeningRules {
        return OpeningRules.create(tags["opening_hours"])
    }

    val wikiDataId get(): String? = tags["wikidata"]

    fun asListOfOsmTags(): List<OsmTag> {
        return tags.map {OsmTag(key = it.key, value = it.value)}
    }

    fun setTagValue(key: String, value: String): OsmTags {
        val mutableTags: MutableMap<String,String> = tags as MutableMap<String, String>
        mutableTags[key] = value

        return OsmTags(tags = mutableTags)

    }

    fun removeTag(key: String): OsmTags {
        val mutableTags: MutableMap<String,String> = tags as MutableMap<String, String>
        mutableTags.remove(key)

        return OsmTags(tags = mutableTags)
    }

    fun addTag(key: String, value: String): OsmTags {

        return OsmTags(tags = tags + mapOf(key to value))
    }
}