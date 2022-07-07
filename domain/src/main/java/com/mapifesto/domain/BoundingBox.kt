package com.mapifesto.domain

data class BoundingBox(
    val southWest: LatLon,
    val northEast: LatLon
) {
    companion object {
        //sw, ne in form "lat, lon"
        fun createFromStrings(sw: String, ne: String): BoundingBox? {
            val swList = sw.split(",")
            val neList = ne.split(",")

            if(swList.size != 2 || neList.size != 2)
                return null

            val south: Double = try {
                swList[0].toDouble()
            }  catch (ex: NumberFormatException) {
                return null
            }

            val west: Double = try {
                swList[1].toDouble()
            }  catch (ex: NumberFormatException) {
                return null
            }

            val north: Double = try {
                neList[0].toDouble()
            }  catch (ex: NumberFormatException) {
                return null
            }

            val east: Double = try {
                neList[1].toDouble()
            }  catch (ex: NumberFormatException) {
                return null
            }

            return BoundingBox(
                southWest = LatLon(lat = south, lon = west),
                northEast = LatLon(lat = north, lon = east)
            )
        }
    }
}
