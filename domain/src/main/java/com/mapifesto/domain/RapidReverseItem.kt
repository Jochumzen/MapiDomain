package com.mapifesto.domain

data class RapidReverseItem(
    val address: String,
    val postalCode: String?,
    val country: String,
    val region: String,
    val area: String?,
    val locality: String?,
    val sublocality: String?,
    val street: String?,
    val house: String?,
    val lat: String,
    val lon: String,
    val locationType: String,
    val type: String,
) {

    val locationString get(): String {
        return "$street, $locality, $area, $region, $country"
    }

}

/*fun createLocationStringFromReverseGeocode(items: RapidReverseItems?): String {

    val areaItem = items?.items?.find { it.type == "area" }
    val localityItem = items?.items?.find { it.type == "locality" }
    val poiItem = items?.items?.find { it.type == "poi" }
    val routeItem = items?.items?.find { it.type == "route" }
    val streetItem = items?.items?.find { it.type == "street_address" }

    return when {
        streetItem != null -> "${streetItem.street}, ${streetItem.locality}, ${streetItem.area}, ${streetItem.region}, ${streetItem.country}"
        routeItem != null -> "${routeItem.street}, ${routeItem.locality}, ${routeItem.area}, ${routeItem.region}, ${routeItem.country}"
        poiItem != null -> "${poiItem.locality}, ${poiItem.area}, ${poiItem.region}, ${poiItem.country}"
        localityItem != null -> "${localityItem.locality}, ${localityItem.area}, ${localityItem.region}, ${localityItem.country}"
        areaItem != null -> "${areaItem.area}, ${areaItem.region}, ${areaItem.country}"
        else -> "No location info found"
    }


}*/
