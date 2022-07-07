package com.mapifesto.domain

data class OverpassElements(
    val items: List<OverpassElement>
) {
    fun cleanList(): OverpassElements {
        val retainedElements: MutableList<OverpassElement> = mutableListOf()
        items.forEach { element ->
            if(element.tags.tags["highway"] == null && element.tags.tags["landuse"] == null && element.tags.tags["bus"] == null && element.tags.tags["route"] == null && element.tags.tags["landuse"] == null && element.tags.tags["public_transport"] == null) {
                retainedElements.add(element)
            }
        }
        return OverpassElements(
            items = retainedElements
        )
    }
}
