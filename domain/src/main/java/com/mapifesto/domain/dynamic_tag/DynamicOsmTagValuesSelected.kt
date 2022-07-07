package com.mapifesto.domain.dynamic_tag

import com.mapifesto.domain.OsmTag

//All values selected for a dynamic tag
data class DynamicOsmTagValuesSelected(
    val suggestedValuesSelected: List<DynamicOsmTagValueSelected> = listOf(),
    val ownValuesSelected: List<DynamicOsmTagValueSelected> = listOf(),
) {
    fun asString(): String {
        val stringList: List<String> = suggestedValuesSelected.filter { it.selected }.map { it -> it.name } + ownValuesSelected.filter { it.selected }.map { it -> it.name}
        return stringList.joinToString(";") { it }
    }

    //value is a semicolon separated string of tag values like "asian;balkan;mexican"
    fun setFromValue(value: String): DynamicOsmTagValuesSelected {

        //Put all values in value into a list
        val listOfTagValues = value.split(";")

        return DynamicOsmTagValuesSelected(
            suggestedValuesSelected = suggestedValuesSelected.map { DynamicOsmTagValueSelected(name = it.name, selected = listOfTagValues.contains(it.name)) },
            ownValuesSelected = listOfTagValues.mapNotNull { tagValue -> if(suggestedValuesSelected.any { it.name == tagValue }) null else DynamicOsmTagValueSelected(name = tagValue, selected = true) }
        )
    }

    fun setSuggestedValue(item: DynamicOsmTagValueSelected): DynamicOsmTagValuesSelected {

        return DynamicOsmTagValuesSelected(
            suggestedValuesSelected = suggestedValuesSelected.map { DynamicOsmTagValueSelected(name = it.name, selected = it == item) },
            ownValuesSelected = listOf(),
        )

    }

    fun toggleSuggestedValue(item: DynamicOsmTagValueSelected): DynamicOsmTagValuesSelected {
        return DynamicOsmTagValuesSelected(
            suggestedValuesSelected = suggestedValuesSelected.map { DynamicOsmTagValueSelected(name = it.name, selected = if(it == item) !item.selected else it.selected) },
            ownValuesSelected = ownValuesSelected,
        )
    }

    fun setOwnValue(value: String): DynamicOsmTagValuesSelected {
        return DynamicOsmTagValuesSelected(
            suggestedValuesSelected = suggestedValuesSelected.map { DynamicOsmTagValueSelected(name = it.name, selected = false) },
            ownValuesSelected = listOf(DynamicOsmTagValueSelected(name = value, selected = true))
        )
    }

    fun atLeastOneSelected(): Boolean {
        var selected = false
        suggestedValuesSelected.forEach {
            if(it.selected)
                selected = true
        }
        ownValuesSelected.forEach {
            if(it.selected)
                selected = true
        }
        return selected
    }

    fun addOwnValue(value: String): DynamicOsmTagValuesSelected {
        return DynamicOsmTagValuesSelected(
            suggestedValuesSelected = suggestedValuesSelected,
            ownValuesSelected = ownValuesSelected + listOf(DynamicOsmTagValueSelected(name = value, selected = true))
        )
    }

    fun selectOwnValue(item: DynamicOsmTagValueSelected): DynamicOsmTagValuesSelected {
        return DynamicOsmTagValuesSelected(
            suggestedValuesSelected = suggestedValuesSelected,
            ownValuesSelected = ownValuesSelected.map { DynamicOsmTagValueSelected(name = it.name, selected = if(it == item) !item.selected else it.selected) },
        )
    }


    companion object {

        fun createEmptyFromSpecifics(tagSpecifics: DynamicOsmTagSpecifics): DynamicOsmTagValuesSelected {

            return DynamicOsmTagValuesSelected(
                suggestedValuesSelected = tagSpecifics.suggestedValues.map { DynamicOsmTagValueSelected(name = it, selected = false)},
                ownValuesSelected = listOf(),
            )
        }
    }
}
