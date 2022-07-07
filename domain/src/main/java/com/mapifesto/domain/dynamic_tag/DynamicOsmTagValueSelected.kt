package com.mapifesto.domain.dynamic_tag

//One specific alternative that may be selected like "yes" for wheelchair
//Not necessarily one of the suggested values
data class DynamicOsmTagValueSelected(
    val name: String,
    val selected: Boolean,
) {
    val fancyName get(): String {
        return name.replace("_", " ").replaceFirstChar { it.uppercase()}
    }
}
