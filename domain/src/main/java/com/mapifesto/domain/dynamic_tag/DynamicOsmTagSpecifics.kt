package com.mapifesto.domain.dynamic_tag


data class DynamicOsmTagSpecifics(
    val id: Int = 0,
    val name: String,
    val allowedKeys: List<String> = listOf(),
    val defaultKey: String,
    val allowFreeText: Boolean = false,
    val freeTextMustBeUrl: Boolean = false,
    val regex: Regex? = null,
    val numberOnly: Boolean = false,
    val suggestedValues: List<String> = listOf(),
    val maySelectOutOfList: Boolean = false,
    val maySelectSeveral: Boolean = false,
    val url: String? = null,
    val urlTitle: String? = null,
    val description: String? = null,
    val imageUrl: String? = null,
    val weight: Int? = null,
    val icon: Int? = null,
)
