package com.mapifesto.domain

import com.mapifesto.domain.dynamic_tag.DynamicTagsData


data class OsmTagsEdit(
    val tags: List<OsmTagEdit>
) {

    fun setTagValue(key: String, value: String): OsmTagsEdit {

        val mutableTags: MutableList<OsmTagEdit> = mutableListOf()
        mutableTags.addAll(tags)

        tags.firstOrNull {it.osmTag.key == key}?.let{ tag ->
            mutableTags[tags.indexOf(tag)] = tag.setValue(value)
        }

        return OsmTagsEdit(tags = mutableTags)
    }

    fun setTagValue(dynamicTagId: Int, value: String): OsmTagsEdit {

        val mutableTags: MutableList<OsmTagEdit> = mutableListOf()
        mutableTags.addAll(tags)

        tags.firstOrNull {it.dynamicTagId == dynamicTagId}?.let{ tag ->
            mutableTags[tags.indexOf(tag)] = tag.setValue(value)
        }

        return OsmTagsEdit(tags = mutableTags)
    }

    fun addDynamicTag(dynamicTagId: Int): OsmTagsEdit {
        if (tags.any { it.dynamicTagId == dynamicTagId }) {
            return OsmTagsEdit(tags = tags)
        }
        val newTag = DynamicTagsData.getDynamicTagById(dynamicTagId)
        return if(newTag == null) OsmTagsEdit(tags = tags) else OsmTagsEdit(tags = tags + OsmTagEdit.createEmptyFromDynamicTagSpecifics(newTag))
    }

    fun removeTag(tag: OsmTagEdit): OsmTagsEdit {
        val mutableTags: MutableList<OsmTagEdit> = mutableListOf()
        mutableTags.addAll(tags)

        //If it is a custom-tag then find and remove it by "key" otherwise use dynamicTagId
        if(tag.osmTagEditType == OsmTagEditType.CUSTOM) {
            tags.firstOrNull {it.osmTag.key == tag.osmTag.key}?.let {
                mutableTags.remove(it)
            }
        } else {
            tags.firstOrNull {it.dynamicTagId == tag.dynamicTagId}?.let {
                mutableTags.remove(it)
            }
        }

        return OsmTagsEdit(tags = mutableTags)
    }

    fun addCustomTag(key: String, value: String): OsmTagsEdit {
        return OsmTagsEdit(tags = tags + OsmTagEdit.createCustomTag(key, value))
    }

    //return only tags with a value
    fun asListOfOsmTags(): List<OsmTag> {
        return tags.mapNotNull { if(it.osmTag.value == "") null else it.osmTag }
    }

    companion object {
        fun createEmptyFromType(type: OsmType): OsmTagsEdit {

            val allDynamicTags = DynamicTagsData.allTags

            //The tag representing the type (e.g. "amenity = bar" for type Bar)
            val typeTag = listOf(
                OsmTagEdit(
                    osmTag = OsmTag(
                        key = type.osmKey,
                        value = type.osmValue,
                    ),
                    osmTagEditType = OsmTagEditType.TYPE_TAG,
                    dynamicTagId = 0,
                )
            )

            //Tags determined by the type
            val osmTags = type.osmDynamicTags.mapNotNull { tagName ->
                allDynamicTags.firstOrNull { it.name == tagName }?.let { dynamicTag ->
                    OsmTagEdit.createEmptyFromDynamicTagSpecifics(dynamicTag)
                }
            }

            return OsmTagsEdit(tags = typeTag + osmTags)
        }
    }
}
