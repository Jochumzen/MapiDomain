package com.mapifesto.domain

import kotlin.math.round

data class LatLon(
    val lat: Double,
    val lon: Double,
) {
    companion object {
        fun mockup(): LatLon {
            return LatLon(lat = 55.0, lon = 33.0)
        }

        fun createFromStrings(lat: String, lon: String): LatLon? {
            return try {
                LatLon(lat.toDouble(), lon.toDouble())
            }  catch (ex: NumberFormatException) {
            return null
            }
        }


    }

    fun print():String {
        val z = ((lat*1000).toInt()).toDouble()/1000
        return "Lat: ${round(lat*1000) /1000}, Lon: ${round(lon*1000) /1000}"

    }
}