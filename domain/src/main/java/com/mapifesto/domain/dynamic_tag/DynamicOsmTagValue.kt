package com.mapifesto.domain.dynamic_tag

import com.mapifesto.domain.OsmTag

//The value that a dynamic tag contains. May be a free text or a selected value
data class DynamicOsmTagValue(
    val tagSpecifics: DynamicOsmTagSpecifics,
    //val tagHasValue: Boolean = false,
    val key: String,
    val freeText: String? = null,
    val selectedValues: DynamicOsmTagValuesSelected = DynamicOsmTagValuesSelected(),        //e.g. for wheelchair:  "yes = true, no = false, limited = false, dedicated = false"
) {

    fun asString(): String {
        return if (tagSpecifics.allowFreeText) freeText?: "" else selectedValues.asString()
    }

    fun setFromValue(value: String): DynamicOsmTagValue {
        return if(tagSpecifics.allowFreeText)
            DynamicOsmTagValue(
                tagSpecifics = tagSpecifics,
                //tagHasValue = true,
                key = key,
                freeText = value,
                selectedValues = DynamicOsmTagValuesSelected(),
            )
        else
            DynamicOsmTagValue(
                tagSpecifics = tagSpecifics,
                //tagHasValue = true,
                key = key,
                freeText = "",
                selectedValues = selectedValues.setFromValue(value),
            )
    }

    companion object {

        fun createEmptyFromSpecifics(tagSpecifics: DynamicOsmTagSpecifics): DynamicOsmTagValue {

            return if(tagSpecifics.allowFreeText)
                DynamicOsmTagValue(
                    tagSpecifics = tagSpecifics,
                    //tagHasValue = false,
                    key = tagSpecifics.defaultKey,
                    freeText = "",
                    selectedValues = DynamicOsmTagValuesSelected(),
                )
            else
                DynamicOsmTagValue(
                    tagSpecifics = tagSpecifics,
                    //tagHasValue = false,
                    key = tagSpecifics.defaultKey,
                    freeText = "",
                    selectedValues = DynamicOsmTagValuesSelected.createEmptyFromSpecifics(tagSpecifics),
                )
        }


    }
}
