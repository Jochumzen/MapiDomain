package com.mapifesto.domain

data class TagRestriction(
    val tagRestrictionId: Int? = null,               //Only for restrictions in data / TagRestrictions
    val tagRestrictionTitle: String,         //e.g. "Cuisine - asian"
    val keys: List<String> = listOf(),                  //A restriction may have two keys like "phone", "contact:phone". A restriction with two keys means that it is satisfied if any of the keys satisfy the restriction
    val allValues: Boolean? = null,                  //True means that restriction is satisfied for *any* value. Only a tag with given key must exist. e.g. "key=wikidata". "value" is irrelevant as a restriction
    val values: List<String> = listOf(),                //If allValues is false, list of "value"s that makes restriction true
    val description: String? = null,         //e.g. "Restrict the search to places that serve asian food"
    val osmTypeId: Int? = null,              //Only for restrictions in data / OsmTypes
    val imageName: String? = null,
    val osmUrl: String? = null,
)
