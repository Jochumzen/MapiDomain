package com.mapifesto.domain

data class OrsSources(
    val openStreetMap: Boolean = true,
    val openAddresses: Boolean = true,
    val whosOnFirst: Boolean = true,
    val geonames: Boolean = true,
) {
    fun asString(): String? {
        return if(openStreetMap && openAddresses && whosOnFirst && geonames)
            null
        else {

            val stringList: MutableList<String> = mutableListOf()
            if(openStreetMap) stringList.add("openstreetmap")
            if(openAddresses) stringList.add("openaddresses")
            if(whosOnFirst) stringList.add("whosonfirst")
            if(geonames) stringList.add("geonames")
            stringList.joinToString(separator = ", ")
        }
    }

    companion object {
        fun createOnlyOSM(): OrsSources {
            return OrsSources(
                openStreetMap = true,
                openAddresses = false,
                whosOnFirst = false,
                geonames = false
            )
        }
        fun createOnlyWhosOnFirst(): OrsSources {
            return OrsSources(
                openStreetMap = false,
                openAddresses = false,
                whosOnFirst = true,
                geonames = false
            )
        }
    }
}
