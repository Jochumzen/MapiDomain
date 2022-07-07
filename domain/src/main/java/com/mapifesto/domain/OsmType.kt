package com.mapifesto.domain

data class OsmType(
    val osmTypeId: Int,
    val osmKey: String,
    val osmValue: String,
    val nameEn: String,
    val nameSv: String = "No swedish name",
    val canBeNode: Boolean = true,
    val canBeWay: Boolean = true,
    val canBeRelation: Boolean = true,
    val isCommon: Boolean = true,
    val descriptionEn: String = "No english description",
    val descriptionSv: String = "No english description",
    val imageName: String = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfaOiR79IzrIKdaGymG-Loxl0O2nQawwsyWw&usqp=CAU",
    val osmUrl: String = "https://wiki.openstreetmap.org/",
    val osmDynamicTags: List<String> = listOf(),
    val errorMessage: String? = null,
) {

    companion object {
        fun createFromTags(tags: Map<String, String>) : OsmType {

            //The following keys represent a TYPE: amenity, shop, leisure, tourism, office, craft, historic, landuse
            //We expect precisely one of these to be present in tags, that is, one should be not null and the rest should be null
            val amenity = tags["amenity"]
            val shop = tags["shop"]
            val leisure = tags["leisure"]
            val tourism = tags["tourism"]
            val office = tags["office"]
            val craft = tags["craft"]
            val historic = tags["historic"]
            val landuse = tags["landuse"]

            var numberOfTypeKeys = 0
            amenity?.let { numberOfTypeKeys++ }
            shop?.let { numberOfTypeKeys++ }
            leisure?.let { numberOfTypeKeys++ }
            tourism?.let { numberOfTypeKeys++ }
            office?.let { numberOfTypeKeys++ }
            craft?.let { numberOfTypeKeys++ }
            historic?.let { numberOfTypeKeys++ }
            landuse?.let { numberOfTypeKeys++ }

            //Only one of them should be not null, else error
            if (numberOfTypeKeys != 1)
                return OsmType(
                    osmTypeId = 0,
                    osmKey = "",
                    osmValue = "",
                    nameEn = "",
                    errorMessage = "Type failed. Type tags not 1"
/*                    errorMessage = "Failed to create DynamicOsmTags from tags. Number of type-keys is $numberOfTypeKeys and it must be 1." +
                            "Type keys are amenity: $amenity, shop: $shop, leisure: $leisure, tourism: $tourism, office: $office, craft: $craft, historic: $historic, landuse: $landuse."*/
                )

            //Now create the type from the tags. This will work if we have the key/value combination identified. If we cannot recognize it as a type, error.

            return OsmTypeData.allTypes.firstOrNull {
                tags[it.osmKey] == it.osmValue
            }
                ?: OsmType(
                    osmTypeId = 0,
                    osmKey = "",
                    osmValue = "",
                    nameEn = "",
                    errorMessage = "Type failed. Type tag unrecognized"
/*                    errorMessage = "Failed to create DynamicOsmTags from tags. We have one type-key but its value is not recognized. " +
                            "Type keys are amenity: $amenity, shop: $shop, leisure: $leisure, tourism: $tourism, office: $office, craft: $craft, historic: $historic, landuse: $landuse."*/
                )
        }
    }
}
