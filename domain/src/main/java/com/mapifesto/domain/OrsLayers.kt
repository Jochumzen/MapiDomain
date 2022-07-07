package com.mapifesto.domain

data class OrsLayers(
    val address: Boolean = true,
    val venue: Boolean = true,
    val neighbourhood: Boolean = true,
    val locality: Boolean = true,
    val borough: Boolean = true,
    val localadmin: Boolean = true,
    val county: Boolean = true,
    val macrocounty: Boolean = true,
    val region: Boolean = true,
    val macroregion: Boolean = true,
    val country: Boolean = true,
    val coarse: Boolean = true,
){
    fun asString(): String? {
        return if(address && venue && neighbourhood && locality && borough && localadmin && county && macrocounty && region && macroregion && country && coarse)
            null
        else {

            val stringList: MutableList<String> = mutableListOf()
            if(address) stringList.add("address")
            if(venue) stringList.add("venue")
            if(neighbourhood) stringList.add("neighbourhood")
            if(locality) stringList.add("locality")
            if(borough) stringList.add("borough")
            if(localadmin) stringList.add("localadmin")
            if(county) stringList.add("county")
            if(macrocounty) stringList.add("macrocounty")
            if(region) stringList.add("region")
            if(macroregion) stringList.add("macroregion")
            if(country) stringList.add("country")
            if(coarse) stringList.add("coarse")
            stringList.joinToString(separator = ", ")
        }
    }

    companion object {
        fun createOnlyCourse(): OrsLayers {
            return OrsLayers(
                address = false,
                venue = false,
                neighbourhood = false,
                locality = false,
                borough = false,
                localadmin = false,
                county = false,
                macrocounty = false,
                region = false,
                macroregion = false,
                country = false,
                coarse = true,
            )
        }

        fun createOnlyVenue(): OrsLayers {
            return OrsLayers(
                address = false,
                venue = true,
                neighbourhood = false,
                locality = false,
                borough = false,
                localadmin = false,
                county = false,
                macrocounty = false,
                region = false,
                macroregion = false,
                country = false,
                coarse = false,
            )
        }
    }
}
