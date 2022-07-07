package com.mapifesto.domain

import com.mapifesto.domain.dynamic_tag.DynamicOsmTagSpecifics

data class OsmTagEdit(
    val osmTag: OsmTag,
    val osmTagEditType: OsmTagEditType,
    val dynamicTagId: Int
) {
    val fancyKey get(): String {
        return osmTag.key.replace("_", " ").replaceFirstChar { it.uppercase()}
    }
    val fancyValue get(): String {

        val listOfValues = osmTag.value.split(";")
        val listOfFancyValues = listOfValues.map { it -> it.replace("_", " ").replaceFirstChar { it.uppercase()}}
        return listOfFancyValues.joinToString(", ") { it }
    }

    val valueOrEmptyString get(): String {
        return if(osmTag.value == "") "EmptyString" else osmTag.value
    }

    fun setValue(value: String): OsmTagEdit {
        return this.copy(
            osmTag = osmTag.setValue(value)
        )
    }

    companion object {
        fun createEmptyFromDynamicTagSpecifics(dynamicTag: DynamicOsmTagSpecifics): OsmTagEdit {

            return OsmTagEdit(
                osmTag = OsmTag(
                    key = dynamicTag.defaultKey,
                    value = ""
                ),
                osmTagEditType = OsmTagEditType.create(dynamicTag),
                dynamicTagId = dynamicTag.id
            )
        }

        fun createCustomTag(key: String, value: String): OsmTagEdit {
            return OsmTagEdit(
                osmTag = OsmTag(
                    key = key,
                    value = value
                ),
                osmTagEditType = OsmTagEditType.CUSTOM,
                dynamicTagId = 0
            )
        }
    }
}

enum class OsmTagEditType {
    FREETEXT, SELECT, OPENING, CUSTOM, TYPE_TAG;
    companion object {

        fun create(dynamicTag: DynamicOsmTagSpecifics): OsmTagEditType {
            return if(dynamicTag.name == "Opening Hours") OPENING else {
                if(dynamicTag.allowFreeText) FREETEXT else SELECT
            }
        }

    }

}
