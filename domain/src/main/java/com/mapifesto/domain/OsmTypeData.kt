
package com.mapifesto.domain

import com.mapifesto.domain.dynamic_tag.DynamicOsmTagSpecifics
import com.mapifesto.domain.dynamic_tag.DynamicTagsData

object OsmTypeData {

    val allTypes = listOf(
        OsmType(
            osmTypeId = 1,
            osmKey = "amenity",
            osmValue = "bar",
            nameEn = "Bar",
            descriptionEn = "Bar is a purpose-built commercial establishment that sells alcoholic drinks to be consumed on the premises. They are characterised by a noisy and vibrant atmosphere, similar to a party and usually don't sell food.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Bar_MXCT.JPG/800px-Bar_MXCT.JPG",
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dbar",
            osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair", "Microbrewery", "Brewery", "Brand", "Brand website")
        ),
        OsmType(
            osmTypeId = 2,
            osmKey = "amenity",
            osmValue = "cafe",
            nameEn = "Cafe",
            descriptionEn = "Cafe is generally an informal place that offers casual meals and beverages; typically, the focus is on coffee or tea. Also known as a coffeehouse/shop, bistro or sidewalk cafe. The kind of food served may be mapped with the tags cuisine=* and diet=*. See also the tags amenity=restaurant;bar;fast_food.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Klagenfurt_W%C3%B6rthersee_Strandbad_Cafe_Sunset_Bar_11102008_65.jpg/800px-Klagenfurt_W%C3%B6rthersee_Strandbad_Cafe_Sunset_Bar_11102008_65.jpg",
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcafe",
            osmDynamicTags = listOf("Name", "Café",	"Opening Hours",	"Phone",	"Website",	"Cuisine",	"Diet",	"Wheelchair",	"Takeaway",	"Indoor seating",	"Outdoor seating",	"Ice cream", "Brand", "Brand website")
        ),
        OsmType(
            osmTypeId = 3,
            osmKey = "amenity",
            osmValue = "stripclub",
            nameEn = "Stripclub",
            descriptionEn = "A place that offers striptease or lapdancing (for sexual services use type: brothel).",
            imageName = "https://wiki.openstreetmap.org/w/images/b/bc/Stripclub.jpg",
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dstripclub",
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Min age",),
        ),
        OsmType(
            osmTypeId = 4,
            osmKey = "amenity",
            osmValue = "place_of_worship",
            nameEn = "Place of worship",
            descriptionEn = "A Church, mosque, or temple, etc. For this type, add tag religion=*, and possibly denomination=*.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/d/db/Place_of_worship.png/200px-Place_of_worship.png",
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dplace_of_worship",
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Wikidata",	"Building",	"Religion",	"Denomination",	"Church", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 5,
            osmKey = "amenity",
            osmValue = "restaurant",
            nameEn = "Restaurant",
            descriptionEn = "Restaurant (for fast food, use instead type Fast food). The kind of food served can be tagged with cuisine=* and diet=*.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/8/89/Ciel_de_Paris_%28restaurant%29_005.JPG",
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Drestaurant",
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Cuisine",	"Diet",	"Wheelchair",	"Takeaway",	"Outdoor seating",	"Delivery",	"Reservation", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 6,
            osmKey = "shop",
            osmValue = "butcher",
            nameEn = "Butcher",
            descriptionEn = "Shop focused on selling meat",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Butcher_shop_in_Valencia.jpg/400px-Butcher_shop_in_Valencia.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbutcher",
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Diet",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 7,
            osmKey = "shop",
            osmValue = "alcohol",
            nameEn = "Alcohol",
            descriptionEn = "A shop selling alcohol to take away",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Liquor_store_in_Breckenridge_Colorado.jpg/400px-Liquor_store_in_Breckenridge_Colorado.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dalcohol", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Brewery",	"Distillery",	"Drink",	"Brand", "Winery", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 8,
            osmKey = "shop",
            osmValue = "confectionery",
            nameEn = "Confectionery",
            descriptionEn = "Shop focused on selling sweets or candy",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Sweet_Shop%2C_Chester.JPG/400px-Sweet_Shop%2C_Chester.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dconfectionery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 9,
            osmKey = "shop",
            osmValue = "convenience",
            nameEn = "Convenience store",
            descriptionEn = "A small local shop carrying a small subset of the items you would find in a supermarket",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/d/d9/Food_and_wine_shop.jpg/400px-Food_and_wine_shop.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dconvenience", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Cuisine",	"Wheelchair",	"Ice cream",	"Operator",	"Fair trade", "Origin", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 10,
            osmKey = "shop",
            osmValue = "ice_cream",
            nameEn = "Ice cream",
            descriptionEn = "Shop selling ice cream",
            imageName = "https://wiki.openstreetmap.org/w/images/4/4a/Shop-ice_cream.jpeg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dice_cream", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 11,
            osmKey = "shop",
            osmValue = "hairdresser",
            nameEn = "Hairdresser",
            descriptionEn = "Here you can get your hair cut, coloured, … See also shop=beauty",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Diego%27s_Hair_Salon.jpg/400px-Diego%27s_Hair_Salon.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dhairdresser", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Reservation",	"Beauty",),
        ),
        OsmType(
            osmTypeId = 12,
            osmKey = "shop",
            osmValue = "jewelry",
            nameEn = "Jewelry",
            descriptionEn = "Jewellers shops.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Gibraltar%2C_Main_Street%2C_Shopping.JPG/400px-Gibraltar%2C_Main_Street%2C_Shopping.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Djewelry", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 13,
            osmKey = "shop",
            osmValue = "clothes",
            nameEn = "Clothes",
            descriptionEn = "Shop focused on selling clothes and/or underwear (other related value in use is fashion)",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Hasseen2.jpg/400px-Hasseen2.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dclothes", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Clothes",	"Second Hand", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 14,
            osmKey = "shop",
            osmValue = "beauty",
            nameEn = "Beauty",
            descriptionEn = "A non-hairdresser beauty shop, spa, nail salon, etc.. See also shop=hairdresser.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/7/7c/H_and_J_nails.JPG/400px-H_and_J_nails.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbeauty", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Beauty",),
        ),
        OsmType(
            osmTypeId = 15,
            osmKey = "shop",
            osmValue = "shoes",
            nameEn = "Shoes",
            descriptionEn = "Shop focused on selling shoes.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Calzados_La_Americana.JPG/400px-Calzados_La_Americana.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dshoes", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Second Hand",	"Shoes", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 16,
            osmKey = "amenity",
            osmValue = "fast_food",
            nameEn = "Fast food",
            descriptionEn = "Fast food restaurant (see also amenity=restaurant). The kind of food served can be tagged with cuisine=* and diet=*.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/8/8a/Burger_king_kamen_osm.jpg/400px-Burger_king_kamen_osm.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dfast_food", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Cuisine",	"Diet",	"Wheelchair",	"Takeaway",	"Outdoor seating",	"Delivery",	"Drive through",	"Drive in",	"Capacity", "Origin",  "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 17,
            osmKey = "amenity",
            osmValue = "driving_school",
            nameEn = "Driving school",
            descriptionEn = "Driving School which offers motor vehicle driving lessons",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Driving_school_in_Bia%C5%82ystok_%28Mechaniak%29.jpg/400px-Driving_school_in_Bia%C5%82ystok_%28Mechaniak%29.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Ddriving_school", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"License classes",),
        ),
        OsmType(
            osmTypeId = 18,
            osmKey = "amenity",
            osmValue = "library",
            nameEn = "Library ",
            descriptionEn = "A public library (municipal, university, …) to borrow books from.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Guantanamo_captives%27_library_a.jpg/400px-Guantanamo_captives%27_library_a.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dlibrary", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Books",),
        ),
        OsmType(
            osmTypeId = 19,
            osmKey = "amenity",
            osmValue = "school",
            nameEn = "School",
            descriptionEn = "School and grounds - primary, middle and seconday schools",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/St%C4%85pork%C3%B3w%2C_Szko%C5%82a_Podstawowa_nr_2.jpg/400px-St%C4%85pork%C3%B3w%2C_Szko%C5%82a_Podstawowa_nr_2.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dschool", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Capacity",	"Fee",	"Min age",	"Max age",	"Operator",	"Operator type", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 20,
            osmKey = "amenity",
            osmValue = "university",
            nameEn = "University",
            descriptionEn = "An university campus: an institute of higher education",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/9/97/Dscf1076_600.jpg/400px-Dscf1076_600.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Duniversity", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 21,
            osmKey = "amenity",
            osmValue = "car_wash",
            nameEn = "Car wash",
            descriptionEn = "Wash a car",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Carwas.jpg/400px-Carwas.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcar_wash", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Self service",	"Automated",	"Vacuum cleaner",	"Vacuum cleaner fee",	"Vacuum cleaner self service",	"Vacuum cleaner opening hours",	"Truck wash",),
        ),
        OsmType(
            osmTypeId = 22,
            osmKey = "amenity",
            osmValue = "fuel",
            nameEn = "Fuel",
            descriptionEn = "Petrol station; gas station; marine fuel; … Streets to petrol stations are often tagged highway=service.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/d/d7/Gas_Station_Hiroshima.jpg/400px-Gas_Station_Hiroshima.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dfuel", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	"Self service", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 23,
            osmKey = "amenity",
            osmValue = "parking",
            nameEn = "Parking",
            descriptionEn = "Car park. Nodes and areas (without access tag) will get a parking symbol. Areas will be coloured. Streets on car parking are often tagged highway=service and service=parking_aisle.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/P3030027ParkingLot_wb.jpg/400px-P3030027ParkingLot_wb.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dparking", // FIX
            osmDynamicTags = listOf("Parking",),
        ),
        OsmType(
            osmTypeId = 24,
            osmKey = "amenity",
            osmValue = "bank",
            nameEn = "Bank",
            descriptionEn = "Bank or credit union: a financial establishment where customers can deposit and withdraw money, take loans, make investments and transfer funds.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/6/62/Vault.jpg/400px-Vault.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dbank", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Drive through",	"Operator",	"Branch",	"Atm", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 25,
            osmKey = "amenity",
            osmValue = "clinic",
            nameEn = "Clinic",
            descriptionEn = "A medium-sized medical facility or health centre.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/9/96/Clinic_de.jpg/400px-Clinic_de.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dclinic", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 26,
            osmKey = "amenity",
            osmValue = "dentist",
            nameEn = "Dentist",
            descriptionEn = "A dentist practice / surgery.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Military_dentists_in_Guatemala.jpg/400px-Military_dentists_in_Guatemala.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Ddentist", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 27,
            osmKey = "amenity",
            osmValue = "hospital",
            nameEn = "Hospital",
            descriptionEn = "A hospital providing in-patient medical treatment. Often used in conjunction with emergency=* to note whether the medical centre has emergency facilities (A&E (brit.) or ER (am.))",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Intensivstation_%2801%29_2007-03-03.jpg/400px-Intensivstation_%2801%29_2007-03-03.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dhospital", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Beds",	"Emergency",),
        ),
        OsmType(
            osmTypeId = 28,
            osmKey = "amenity",
            osmValue = "pharmacy",
            nameEn = "Pharmacy",
            descriptionEn = "Pharmacy: a shop where a pharmacist sells medications",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Boots_The_Chemist_At_Gunwharf_Quays.jpg/400px-Boots_The_Chemist_At_Gunwharf_Quays.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dpharmacy", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Drive through",	"Operator",	"Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 29,
            osmKey = "amenity",
            osmValue = "veterinary",
            nameEn = "Veterinary",
            descriptionEn = "A place where a veterinary surgeon, also known as a veterinarian or vet, practices.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Veterinary_Surgeon.jpg/400px-Veterinary_Surgeon.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dveterinary", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 30,
            osmKey = "amenity",
            osmValue = "cinema",
            nameEn = "Cinema",
            descriptionEn = "A place where films are shown",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/OdeonWestEnd.jpg/400px-OdeonWestEnd.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcinema", // FIX
            osmDynamicTags = listOf("Drive in",	"Min age",	"Operator",	"Building",	"cinema:3D",	"Screen", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 31,
            osmKey = "amenity",
            osmValue = "theatre",
            nameEn = "Theatre",
            descriptionEn = "A theatre or opera house where live performances occur, such as plays, musicals and formal concerts. Use amenity=cinema for movie theaters.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/9/93/Royal_Opera_House_-_Floral_Hall_-_Bow_Street_-_London_-_240404.jpg/400px-Royal_Opera_House_-_Floral_Hall_-_Bow_Street_-_London_-_240404.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dtheatre", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Theatre genre",	"Theatre type",),
        ),
        OsmType(
            osmTypeId = 32,
            osmKey = "amenity",
            osmValue = "childcare",
            nameEn = "Childcare",
            descriptionEn = "A place where children of different ages are looked after which is not an amenity=kindergarten or preschool.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/USMC-13550.jpg/400px-USMC-13550.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dchildcare", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 33,
            osmKey = "amenity",
            osmValue = "fire_station",
            nameEn = "Fire station",
            descriptionEn = "A station of a fire brigade",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Tower_Ladder_119_26_Hooper_St_jeh.jpg/400px-Tower_Ladder_119_26_Hooper_St_jeh.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dfire_station", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 34,
            osmKey = "amenity",
            osmValue = "police",
            nameEn = "Police station",
            descriptionEn = "A police station where police officers patrol from and that is a first point of contact for civilians",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Met_Police_Blue_Lamp.jpg/400px-Met_Police_Blue_Lamp.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dpolice", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 35,
            osmKey = "amenity",
            osmValue = "public_bath",
            nameEn = "Public bathhouse",
            descriptionEn = "A location where the public may bathe in common, etc. japanese onsen, turkish bath, hot spring",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Blue_Lagoon_2012-08-23_%284%29.JPG/400px-Blue_Lagoon_2012-08-23_%284%29.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dpublic_bath", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Fee",	"Bath type",),
        ),
        OsmType(
            osmTypeId = 36,
            osmKey = "amenity",
            osmValue = "recycling_type",
            nameEn = "Recycling station",
            descriptionEn = "Recycling facilities (bottle banks, etc.). Combine with recycling_type=container for containers or recycling_type=centre for recycling centres.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/8/80/Altglas.jpg/400px-Altglas.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Drecycling", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Recycling type",),
        ),
        OsmType(
            osmTypeId = 37,
            osmKey = "shop",
            osmValue = "bakery",
            nameEn = "Bakery",
            descriptionEn = "Shop focused on selling bread",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Bread_in_shop_window_at_Borough_Market.jpg/400px-Bread_in_shop_window_at_Borough_Market.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbakery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Diet",	"Wheelchair",	"Bakehouse",	"Oven", "Origin", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 38,
            osmKey = "shop",
            osmValue = "cheese",
            nameEn = "Cheese",
            descriptionEn = "Shop focused on selling cheese.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Cheese_shop_P1010071.JPG/400px-Cheese_shop_P1010071.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dcheese", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", ),
        ),
        OsmType(
            osmTypeId = 39,
            osmKey = "shop",
            osmValue = "tea",
            nameEn = "Tea",
            descriptionEn = "Shop focused on selling tea.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Tea_shop_by_matsuyuki_in_Nishiki_Ichiba%2C_Kyoto.jpg/400px-Tea_shop_by_matsuyuki_in_Nishiki_Ichiba%2C_Kyoto.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dtea", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 40,
            osmKey = "shop",
            osmValue = "kiosk",
            nameEn = "Kiosk",
            descriptionEn = "A small shop on the pavement that sells magazines, tobacco, newspapers, sweets and stamps.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/0/0f/Kiosk_germany.jpg/400px-Kiosk_germany.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dkiosk", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 41,
            osmKey = "shop",
            osmValue = "supermarket",
            nameEn = "Supermarket",
            descriptionEn = "Supermarket – a large store with groceries and other items",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Sainsbury%27sGlos.jpg/400px-Sainsbury%27sGlos.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dsupermarket", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair", "Origin", "Fair trade",  "Brand", "Brand website")
        ),
        OsmType(
            osmTypeId = 42,
            osmKey = "shop",
            osmValue = "bag",
            nameEn = "Bag",
            descriptionEn = "Shop focused on selling bags.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/7/75/Shop_bag_berlin.jpg/400px-Shop_bag_berlin.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbag", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Second Hand",),
        ),
        OsmType(
            osmTypeId = 43,
            osmKey = "shop",
            osmValue = "fabric",
            nameEn = "Fabric",
            descriptionEn = "Shop focused on selling fabric and other materials for the purpose of making clothes and other products, eg dress making.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/3/31/Fabrics.jpg/400px-Fabrics.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dfabric", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 44,
            osmKey = "shop",
            osmValue = "cosmetics",
            nameEn = "Cosmetics",
            descriptionEn = "Shop focused on selling cosmetics",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Life_Pharmacy_Westfield_Albany_cosmetics_2013.jpg/400px-Life_Pharmacy_Westfield_Albany_cosmetics_2013.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dcosmetics", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 45,
            osmKey = "shop",
            osmValue = "nutrition_supplements",
            nameEn = "Nutrition supplements",
            descriptionEn = "Shops that sells one or more nutritional supplements (of vitamins, minerals and/or herbs)",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/c/c5/GNC-store.jpg/400px-GNC-store.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dnutrition_supplements", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 46,
            osmKey = "shop",
            osmValue = "optician",
            nameEn = "Optician",
            descriptionEn = "Shop focused on selling eyeglasses, contact lenses (may also check your eyes).",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/AIGAN_Shakujii.jpg/400px-AIGAN_Shakujii.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Doptician", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 47,
            osmKey = "shop",
            osmValue = "tattoo",
            nameEn = "Tattoo",
            descriptionEn = "A tattoo parlour.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Tattoo_parlour_-_geograph.org.uk_-_768007.jpg/400px-Tattoo_parlour_-_geograph.org.uk_-_768007.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dtattoo", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 48,
            osmKey = "shop",
            osmValue = "florist",
            nameEn = "Florist",
            descriptionEn = "Shop focused on selling bouquets of flowers (see shop=garden_centre for potted flowers).",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/5/56/Florist.jpg/400px-Florist.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dflorist", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Delivery", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 49,
            osmKey = "shop",
            osmValue = "hardware",
            nameEn = "Hardware",
            descriptionEn = "Shop focused on selling Building supplies including screws, bolts & paints, … See also shop=doityourself",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Tweedy_and_Popp_03.jpg/400px-Tweedy_and_Popp_03.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dhardware", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 50,
            osmKey = "shop",
            osmValue = "interior_decoration",
            nameEn = "Interior decoration",
            descriptionEn = "Shop focused on selling interior decorations.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/LA_Showroom1_dakota_jackson.jpg/400px-LA_Showroom1_dakota_jackson.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dinterior_decoration", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Origin", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 51,
            osmKey = "shop",
            osmValue = "computer",
            nameEn = "Computer",
            descriptionEn = "Shop focused on selling computers, peripherals, software, …",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Computer_shop%2C_Crossens.JPG/400px-Computer_shop%2C_Crossens.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dcomputer", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Second Hand",	"Repair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 52,
            osmKey = "shop",
            osmValue = "electronics",
            nameEn = "Electronics",
            descriptionEn = "Shop focused on selling consumer electronics (TV, radio, …). Larger ones may also sell computers, fridges, …",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Currys_Digital.jpg/400px-Currys_Digital.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Delectronics", // FIX
           osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 53,
            osmKey = "shop",
            osmValue = "bicycle",
            nameEn = "Bicycle",
            descriptionEn = "Shop focused on selling bicycles, bicycle equipment and may rent or repair them",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Bike_shop_%2842682109291%29.jpg/400px-Bike_shop_%2842682109291%29.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbicycle", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Delivery",	"Operator",	"Second Hand",	"Repair",),
        ),
        OsmType(
            osmTypeId = 54,
            osmKey = "shop",
            osmValue = "car",
            nameEn = "Car",
            descriptionEn = "Car store – a place to buy cars or to get your car repaired",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Preowned.JPG/400px-Preowned.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dcar", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Second Hand",	"service", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 55,
            osmKey = "shop",
            osmValue = "art",
            nameEn = "Art shop",
            descriptionEn = "Shop which sells works of art. May be paintings, sculpture, or other types of art",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/e/ec/Ruiz_gallery.jpg/400px-Ruiz_gallery.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dart", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Origin"),
        ),
        OsmType(
            osmTypeId = 56,
            osmKey = "shop",
            osmValue = "music",
            nameEn = "Music shop",
            descriptionEn = "Shop focused on selling recorded music (vinyl/CDs/...)",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Klang.KOMBINAT_%28record_shop%29%2C_Leipzig.jpg/400px-Klang.KOMBINAT_%28record_shop%29%2C_Leipzig.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dmusic", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Second Hand",	"Music",	"Music genre", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 56,
            osmKey = "shop",
            osmValue = "musical_instrument",
            nameEn = "Musical instrument",
            descriptionEn = "Shop focused on selling musical instruments, lyrics, scores. If focused on a specific instrument, specify with musical_instrument=*",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Portadown_%2866%29%2C_September_2009.JPG/400px-Portadown_%2866%29%2C_September_2009.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dmusical_instrument", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Musical instruments", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 57,
            osmKey = "shop",
            osmValue = "books",
            nameEn = "Books",
            descriptionEn = "Shop focused on selling books (for a library that lends books, see amenity=library)",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Buchhandlung_Lentner_M%C3%BCnchen_Marienplatz_8_-_Kassentheke.jpg/400px-Buchhandlung_Lentner_M%C3%BCnchen_Marienplatz_8_-_Kassentheke.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbooks", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Second Hand",	"Books", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 58,
            osmKey = "leisure",
            osmValue = "fitness_centre",
            nameEn = "Fitness center / gym",
            descriptionEn = "A place with exercise machines and/or fitness/dance classes.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Gym_1-1-.jpg/400px-Gym_1-1-.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dfitness_centre", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Sauna",	"Swimming pool",	"Personal trainer", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 59,
            osmKey = "amenity",
            osmValue = "atm",
            nameEn = "Atm",
            descriptionEn = "ATM or cash point: a device that provides the clients of a financial institution with access to financial transactions.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Fr%C3%BCher_Bankautomat_von_Nixdorf_retouched.jpg/400px-Fr%C3%BCher_Bankautomat_von_Nixdorf_retouched.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Datm", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Drive through",	"Fee",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 60,
            osmKey = "amenity",
            osmValue = "fountain",
            nameEn = "Fountain",
            descriptionEn = "A fountain for cultural / decorational / recreational purposes.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/e/e8/Fountain_at_Milan_citadel.JPG/400px-Fountain_at_Milan_citadel.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dfountain", // FIX
            osmDynamicTags = listOf("Name"),
        ),
        OsmType(
            osmTypeId = 61,
            osmKey = "amenity",
            osmValue = "marketplace",
            nameEn = "Marketplace",
            descriptionEn = "A marketplace where goods and services are traded daily or weekly.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Marche_berlin002.jpg/400px-Marche_berlin002.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dmarketplace", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Building",),
        ),
        OsmType(
            osmTypeId = 62,
            osmKey = "amenity",
            osmValue = "post_office",
            nameEn = "Post office",
            descriptionEn = "Post office Building with postal services",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Post_office_Wenigzell%2C_Styria.jpg/400px-Post_office_Wenigzell%2C_Styria.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dpost_office", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	 "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 63,
            osmKey = "amenity",
            osmValue = "prison",
            nameEn = "Prison",
            descriptionEn = "A prison or jail where people are incarcerated before trial or after conviction",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Osaka_keimusho.jpg/400px-Osaka_keimusho.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dprison", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 64,
            osmKey = "amenity",
            osmValue = "vending_machine",
            nameEn = "Vending machine",
            descriptionEn = "A machine selling goods – food, tickets, newspapers, etc. Add type of goods using vending=*",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Vending_machines_at_Haeundae.jpg/400px-Vending_machines_at_Haeundae.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dvending_machine", // FIX
            osmDynamicTags = listOf("Operator",	"Vending", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 65,
            osmKey = "shop",
            osmValue = "chocolate",
            nameEn = "Chocolate",
            descriptionEn = "Shop focused on selling chocolate.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Chocolate_shop.jpg/400px-Chocolate_shop.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dchocolate", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 66,
            osmKey = "shop",
            osmValue = "coffee",
            nameEn = "Coffee",
            descriptionEn = "Shop focused on selling coffee.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Ahrre%27s_Coffee_Roastery_in_Summit_NJ_interior_view.jpg/400px-Ahrre%27s_Coffee_Roastery_in_Summit_NJ_interior_view.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dcoffee", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 67,
            osmKey = "shop",
            osmValue = "deli",
            nameEn = "Deli",
            descriptionEn = "Shop focused on selling delicatessen (fine foods, gourmet foods), possibly also fine wine. Not to be confused with the US delis.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Rome_Italian_deli.jpg/400px-Rome_Italian_deli.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Ddeli", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Diet",	"Wheelchair", "Origin",  "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 68,
            osmKey = "shop",
            osmValue = "spices",
            nameEn = "Spice",
            descriptionEn = "Shop focused on selling spices.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Old_city%2C_best_spice_shop_%28498280882%29.jpg/400px-Old_city%2C_best_spice_shop_%28498280882%29.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dspices", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 69,
            osmKey = "shop",
            osmValue = "mall",
            nameEn = "Mall",
            descriptionEn = "A shopping mall – multiple stores under one roof (also known as a shopping centre)",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Cevahir_Mall.jpg/400px-Cevahir_Mall.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dmall", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 70,
            osmKey = "shop",
            osmValue = "sewing",
            nameEn = "Sewing supplies",
            descriptionEn = "A shop that sells sewing supplies (fabric, thread, yarn, knitting needles, sewing machines, etc.)",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Jonescs.jpg/400px-Jonescs.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/File:Jonescs.jpg", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 71,
            osmKey = "shop",
            osmValue = "tailor",
            nameEn = "Tailor",
            descriptionEn = "A place where clothing is made, repaired, or altered professionally, especially suits and men's clothing",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Tailor%C2%B4s_shop_-_Werkstatt_2.jpg/400px-Tailor%C2%B4s_shop_-_Werkstatt_2.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:craft%3Dtailor", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Tailor alteration service",	"Tailor bespoke tailoring",),
        ),
        OsmType(
            osmTypeId = 72,
            osmKey = "shop",
            osmValue = "second_hand",
            nameEn = "Second hand",
            descriptionEn = "A shop buying and selling used clothes and other things. See also shop=pawnbroker",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/20130505_Maastricht_Itteren_Hartelstein_02.JPG/400px-20130505_Maastricht_Itteren_Hartelstein_02.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3DSecond Hand", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 73,
            osmKey = "shop",
            osmValue = "variety_store",
            nameEn = "Variety store",
            descriptionEn = "A variety store retailer is a retail store that sells inexpensive items, sometimes with a single price point for all items in the store.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/100-Emon.jpg/400px-100-Emon.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dvariety_store", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Origin",  "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 74,
            osmKey = "shop",
            osmValue = "massage",
            nameEn = "Massage parlor",
            descriptionEn = "A massage shop",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Thaimassage.jpg/400px-Thaimassage.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dmassage", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Massage",),
        ),
        OsmType(
            osmTypeId = 75,
            osmKey = "shop",
            osmValue = "appliance",
            nameEn = "Appliance store",
            descriptionEn = "Shop focused on selling large electrical items (aka white goods) washing machines, fridges, cookers, ovens, fans, etc.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/3/32/Small_appliance_shop_in_North_London.jpg/400px-Small_appliance_shop_in_North_London.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dappliance", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 76,
            osmKey = "shop",
            osmValue = "houseware",
            nameEn = "Houseware store",
            descriptionEn = "Shop focused on selling crockery, cutlery, kitchenware, small household appliances.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/f/f4/Houseware.jpg/400px-Houseware.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dhouseware", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 77,
            osmKey = "shop",
            osmValue = "paint",
            nameEn = "Paint",
            descriptionEn = "Shop focused on selling paints.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Artists_paints.jpg/400px-Artists_paints.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dpaint", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 78,
            osmKey = "shop",
            osmValue = "antiques",
            nameEn = "Antiques",
            descriptionEn = "Shop focused on selling antiques.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/1/16/Shop_antiques_berlin.jpg/400px-Shop_antiques_berlin.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dantiques", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Origin"),
        ),
        OsmType(
            osmTypeId = 79,
            osmKey = "shop",
            osmValue = "bed",
            nameEn = "Bed",
            descriptionEn = "Shop focused on selling mattresses and other bedding products.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Bed_Shop%2C_Omagh_-_geograph.org.uk_-_129722.jpg/400px-Bed_Shop%2C_Omagh_-_geograph.org.uk_-_129722.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dbed", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 80,
            osmKey = "shop",
            osmValue = "carpet",
            nameEn = "Carpet",
            descriptionEn = "Shop focused on selling carpets",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/A_carpet_seller_in_Jaipur.jpg/400px-A_carpet_seller_in_Jaipur.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dcarpet", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 81,
            osmKey = "shop",
            osmValue = "furniture",
            nameEn = "Furniture",
            descriptionEn = "Shop focused on selling furniture, might range from small decorational items to a whole flat interior",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E5%AF%8C%E4%B8%AD%E5%BF%83_Provident_Centre_%E5%92%8C%E5%AF%8C%E8%96%88_Provident_Square_Kuka_Home_furniture_shop_Mar-2013.JPG/400px-HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E5%AF%8C%E4%B8%AD%E5%BF%83_Provident_Centre_%E5%92%8C%E5%AF%8C%E8%96%88_Provident_Square_Kuka_Home_furniture_shop_Mar-2013.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dfurniture",
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 82,
            osmKey = "shop",
            osmValue = "mobile_phone",
            nameEn = "Mobile phone",
            descriptionEn = "Shop focused on selling mobile phones and accessories",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/0/09/Shop_mobile_phone.jpg/400px-Shop_mobile_phone.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/File:Shop_mobile_phone.jpg", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	 "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 83,
            osmKey = "shop",
            osmValue = "fishing",
            nameEn = "Fishing equipment",
            descriptionEn = "Shop focused on selling fishing equipment.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/M.A._Wickham%2C_East_Grinstead_%2815538910361%29.jpg/400px-M.A._Wickham%2C_East_Grinstead_%2815538910361%29.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dfishing", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 84,
            osmKey = "shop",
            osmValue = "hunting",
            nameEn = "Hunting equipment",
            descriptionEn = "Shop focused on selling gun and hunting equipment.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/5/57/Bass_Pro_Shops_entrance.JPG/400px-Bass_Pro_Shops_entrance.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dhunting", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 85,
            osmKey = "shop",
            osmValue = "outdoor",
            nameEn = "Outdoor equipment",
            descriptionEn = "Shop focused on selling camping, walking, climbing, and other outdoor sports equipment (GPSes, etc.)",
            imageName = "https://wiki.openstreetmap.org/w/images/0/02/Outdoor_shop.png", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Doutdoor", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	 "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 86,
            osmKey = "shop",
            osmValue = "ski",
            nameEn = "Skiing equipment",
            descriptionEn = "Shop focused on selling skis, ski equipment and may rent or repair them",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Alpine_ski_binding_plates_01.jpg/400px-Alpine_ski_binding_plates_01.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dski", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	 "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 87,
            osmKey = "shop",
            osmValue = "funeral_directors",
            nameEn = "Funeral directors",
            descriptionEn = "Providing services related to funeral arrangements, may also be known as a \"funeral parlour\" or \"undertakers\".",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/d/d9/Coop_funeral_care.jpg/400px-Coop_funeral_care.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dfuneral_directors", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Religion",	"Denomination", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 88,
            osmKey = "shop",
            osmValue = "laundry",
            nameEn = "Laundry",
            descriptionEn = "A shop to get your normal clothes washed. Might be self service coin operated, with service staff for drop off, …",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/SoapBarLaundromat.jpg/400px-SoapBarLaundromat.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dlaundry", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	"Self service",),
        ),
        OsmType(
            osmTypeId = 89,
            osmKey = "shop",
            osmValue = "pet",
            nameEn = "Pet",
            descriptionEn = "A shop for pets, animals and toys or food for them.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Baby_parrots_in_a_pet_shop-8a.jpg/400px-Baby_parrots_in_a_pet_shop-8a.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dpet", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"pet",),
        ),
        OsmType(
            osmTypeId = 90,
            osmKey = "shop",
            osmValue = "tobacco",
            nameEn = "Tobacco",
            descriptionEn = "Shop focused on selling tobacco, cigarettes and their related accessories.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Fachgesch%C3%A4ft_f%C3%BCr_Tabakwaren.JPG/400px-Fachgesch%C3%A4ft_f%C3%BCr_Tabakwaren.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dtobacco", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 91,
            osmKey = "shop",
            osmValue = "toys",
            nameEn = "Toy",
            descriptionEn = "Shop focused on selling toys.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Toys_R_Us_sg.JPG/400px-Toys_R_Us_sg.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dtoys", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 92,
            osmKey = "leisure",
            osmValue = "garden",
            nameEn = "Garden",
            descriptionEn = "Place where flowers and other plants are grown in a decorative and structured manner or for scientific purposes.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/SF_Japanese_Garden.JPG/400px-SF_Japanese_Garden.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dgarden", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Garden type",	"Garden style",),
        ),
        OsmType(
            osmTypeId = 93,
            osmKey = "leisure",
            osmValue = "miniature_golf",
            nameEn = "Miniature golf",
            descriptionEn = "A place or area that you can play miniature golf.",
            imageName = "https://wiki.openstreetmap.org/w/images/1/12/BigApple-ccby-rw_.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dminiature_golf", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 94,
            osmKey = "leisure",
            osmValue = "park",
            nameEn = "Park",
            descriptionEn = "Open, green area for recreation, usually municipal.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/3015-Central_Park-Sheep_Meadow.JPG/400px-3015-Central_Park-Sheep_Meadow.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dpark", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Operator",),
        ),
        OsmType(
            osmTypeId = 95,
            osmKey = "leisure",
            osmValue = "playground",
            nameEn = "Playground",
            descriptionEn = "Playground for little children.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/3/3d/Spielplatz.jpg/400px-Spielplatz.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dplayground", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Wheelchair",	"Fee",	"Min age",	"Max age",	"Operator",),
        ),
        OsmType(
            osmTypeId = 96,
            osmKey = "leisure",
            osmValue = "stadium",
            nameEn = "Stadium",
            descriptionEn = "A major sports arena with substantial tiered seating. To describe what kind of sport(s) use sport=*.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Notre-dame-stadium.jpg/400px-Notre-dame-stadium.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dstadium", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Wikidata",	"Capacity",	"Building",	"Sport",),
        ),
        OsmType(
            osmTypeId = 97,
            osmKey = "leisure",
            osmValue = "tanning_salon",
            nameEn = "Tanning salon",
            descriptionEn = "Place where customers can use UV lamps to tan their skin.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Tanning_bed_in_use_%282%29.jpg/400px-Tanning_bed_in_use_%282%29.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dtanning_salon", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Self service",),
        ),
        OsmType(
            osmTypeId = 98,
            osmKey = "leisure",
            osmValue = "water_park",
            nameEn = "Water park",
            descriptionEn = "An amusement park with features like water slides, recreational pools (e.g. wave pools) or lazy rivers.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Caribe01.jpg/400px-Caribe01.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dwater_park", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 99,
            osmKey = "tourism",
            osmValue = "gallery",
            nameEn = "Gallery",
            descriptionEn = "[W]Art gallery or art museum is an area or typically a Building that displays a variety of visual art exhibitions; The most common exhibits being paintings, sculpture or photography. This is not to be confused with tourism=museum.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/c/c7/Malba_Buenos_Aires.jpg/400px-Malba_Buenos_Aires.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:tourism%3Dgallery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Fee",),
        ),
        OsmType(
            osmTypeId = 100,
            osmKey = "tourism",
            osmValue = "hotel",
            nameEn = "Hotel",
            descriptionEn = "Hotels provide accommodation for guests with usually numbered rooms. Some facilities provided may include a basic bed, storage for clothing and additional guest facilities may include swimming pool, childcare, and conference facilities.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Hotel_pool_-_panoramio.jpg/400px-Hotel_pool_-_panoramio.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:tourism%3Dhotel", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Swimming pool",	"Stars",	"Rooms",	"Beds",	"Internet access",	"bar", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 101,
            osmKey = "tourism",
            osmValue = "museum",
            nameEn = "Museum",
            descriptionEn = "Museum is an institution which has exhibitions on scientific, historical, artistic, or cultural artifacts. Typically these are open to the public as a tourist attraction.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/GD-EG-Caire-Mus%C3%A9e007.JPG/400px-GD-EG-Caire-Mus%C3%A9e007.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:tourism%3Dmuseum", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Wikidata",	"Museum",	"Subject",	"Museum type",),
        ),
        OsmType(
            osmTypeId = 102,
            osmKey = "tourism",
            osmValue = "zoo",
            nameEn = "Zoo",
            descriptionEn = "[W] Zoo is an abbreviation for a zoological garden or park that has confined animals on display for viewing by the public.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/San_Diego_Zoo_entrance_elephant.jpg/400px-San_Diego_Zoo_entrance_elephant.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:tourism%3Dzoo", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Zoo",),
        ),
        OsmType(
            osmTypeId = 103,
            osmKey = "office",
            osmValue = "accountant",
            nameEn = "Accountant",
            descriptionEn = "An office for an accountant.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/%D7%A4%D7%A0%D7%99_%D7%9B%D7%94%D7%9F_%D7%9E%D7%A0%D7%94%D7%9C%D7%AA_%D7%97%D7%A9%D7%91%D7%95%D7%A0%D7%95%D7%AA_%D7%AA%D7%99%D7%9B%D7%95%D7%9F_%D7%A8%D7%95%D7%98%D7%91%D7%A8%D7%92.jpg/400px-%D7%A4%D7%A0%D7%99_%D7%9B%D7%94%D7%9F_%D7%9E%D7%A0%D7%94%D7%9C%D7%AA_%D7%97%D7%A9%D7%91%D7%95%D7%A0%D7%95%D7%AA_%D7%AA%D7%99%D7%9B%D7%95%D7%9F_%D7%A8%D7%95%D7%98%D7%91%D7%A8%D7%92.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Daccountant", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 104,
            osmKey = "office",
            osmValue = "advertising_agency",
            nameEn = "Advertising agency",
            descriptionEn = "A service-based business dedicated to creating, planning, and handling advertising.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Picadilly_Circus_London_by_night_2006.jpg/400px-Picadilly_Circus_London_by_night_2006.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Dadvertising_agency", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator type", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 105,
            osmKey = "office",
            osmValue = "architect",
            nameEn = "Architect",
            descriptionEn = "An office for an architect or group of architects.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/800px-ArchiCAD-12-NHS-Floor-Plan.png/400px-800px-ArchiCAD-12-NHS-Floor-Plan.png", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Darchitect", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 106,
            osmKey = "office",
            osmValue = "consulting",
            nameEn = "Consulting",
            descriptionEn = "An office for a consulting firm, providing expert professional advice to other companies or organisations.",
            imageName = "X", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Dconsulting", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 107,
            osmKey = "office",
            osmValue = "estate_agent",
            nameEn = "Estate agent",
            descriptionEn = "A place where you can rent or buy a house.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Former_butchers_shop_now_real_estate_agent_and_shop_in_Pine_Ave.jpg/400px-Former_butchers_shop_now_real_estate_agent_and_shop_in_Pine_Ave.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Destate_agent", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 108,
            osmKey = "office",
            osmValue = "government",
            nameEn = "Government office",
            descriptionEn = "An office of a (supra)national, regional or local government agency or department",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Obama_standing_in_the_Oval_Office.jpg/400px-Obama_standing_in_the_Oval_Office.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Dgovernment", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Government",),
        ),
        OsmType(
            osmTypeId = 109,
            osmKey = "office",
            osmValue = "insurance",
            nameEn = "Insurance agency",
            descriptionEn = "An office at which you can take out insurance policies.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/PZU_Centrum_szk%C3%B3d_i_%C5%9Bwiadcze%C5%84_IMG_20180519_102613.jpg/400px-PZU_Centrum_szk%C3%B3d_i_%C5%9Bwiadcze%C5%84_IMG_20180519_102613.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Dinsurance", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 110,
            osmKey = "office",
            osmValue = "lawyer",
            nameEn = "Lawyer's office",
            descriptionEn = "An office for a lawyer.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Nasenschild.jpg/400px-Nasenschild.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Dlawyer", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Lawyer speciality", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 111,
            osmKey = "office",
            osmValue = "newspaper",
            nameEn = "Newspaper",
            descriptionEn = "An office of a newspaper",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/The_new_york_times_Building_in_new_york_city.jpg/400px-The_new_york_times_Building_in_new_york_city.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:office%3Dnewspaper", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 112,
            osmKey = "amenity",
            osmValue = "bus_station",
            nameEn = "Bus station",
            descriptionEn = "A bus station would usually be a terminus where many routes stop / start, and where you can change between routes, etc.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Braunschweig_Brunswick_Busbahnhof_1_%282006%29.jpg/400px-Braunschweig_Brunswick_Busbahnhof_1_%282006%29.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dbus_station", // FIX
            osmDynamicTags = listOf("Name"),
        ),
        OsmType(
            osmTypeId = 113,
            osmKey = "amenity",
            osmValue = "food_court",
            nameEn = "Food Court",
            descriptionEn = "An area with several different restaurant food counters and a shared eating area. Commonly found in malls, airports, etc.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/FoodCourtVaughanMills.JPG/200px-FoodCourtVaughanMills.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dfood_court", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", ),
        ),
        OsmType(
            osmTypeId = 114,
            osmKey = "amenity",
            osmValue = "kindergarten",
            nameEn = "Kindergarten",
            descriptionEn = "For children too young for a regular school (also known as preschool, playschool or nursery school), in some countries including afternoon supervision of primary school children.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Story_Time.jpg/200px-Story_Time.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dkindergarten", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Capacity",	"Fee",	"Min age",	"Max age",),
        ),
        OsmType(
            osmTypeId = 115,
            osmKey = "amenity",
            osmValue = "car_rental",
            nameEn = "Car Rental",
            descriptionEn = "Rent a car",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Hertz_car_rental_office_Livonia_Michigan.JPG/200px-Hertz_car_rental_office_Livonia_Michigan.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcar_rental", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 116,
            osmKey = "amenity",
            osmValue = "charging_station",
            nameEn = "Charging Station",
            descriptionEn = "Charging facility for electric vehicles",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/6/6b/Evpost.jpg/200px-Evpost.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcharging_station", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Capacity",	"Fee", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 117,
            osmKey = "amenity",
            osmValue = "taxi",
            nameEn = "Taxi",
            descriptionEn = "A place where taxis wait for passengers.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/4/40/Amenity_taxi_picture-Hong_Kong_Shatin_Taxi_Stand.jpg/200px-Amenity_taxi_picture-Hong_Kong_Shatin_Taxi_Stand.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dtaxi", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Capacity",	"Operator",),
        ),
        OsmType(
            osmTypeId = 118,
            osmKey = "amenity",
            osmValue = "bureau_de_change",
            nameEn = "Bureau de change",
            descriptionEn = "Bureau de change, money changer, currency exchange, Wechsel, cambio – a place to change foreign bank notes and travellers cheques.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/c/c0/Bureau_de_change_electronic_sign.jpg/200px-Bureau_de_change_electronic_sign.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dbureau_de_change", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 119,
            osmKey = "amenity",
            osmValue = "social_facility",
            nameEn = "Social Facility",
            descriptionEn = "A facility that provides social services: group & nursing homes, workshops for the disabled, homeless shelters, etc.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Salvation_Army_Citadel%2C_Hill_Street_%2C_Newport_-_geograph.org.uk_-_1585015.jpg/200px-Salvation_Army_Citadel%2C_Hill_Street_%2C_Newport_-_geograph.org.uk_-_1585015.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dsocial_facility", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Emergency",	"Social facility",),
        ),
        OsmType(
            osmTypeId = 120,
            osmKey = "amenity",
            osmValue = "casino",
            nameEn = "Casino",
            descriptionEn = "A gambling venue with at least one table game(e.g. roulette, blackjack) that takes bets on sporting and other events at agreed upon odds.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/7/72/Casin0.jpg/200px-Casin0.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcasino", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 121,
            osmKey = "amenity",
            osmValue = "nightclub",
            nameEn = "Nightclub",
            descriptionEn = "A place to drink and dance (nightclub). The German word is \"Disco\" or \"Discothek\". Please don't confuse this with the German \"Nachtclub\" which is most likely amenity=stripclub.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Gatecrasher.jpg/200px-Gatecrasher.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dnightclub", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 122,
            osmKey = "amenity",
            osmValue = "courthouse",
            nameEn = "Courthouse",
            descriptionEn = "A Building home to a court of law, where justice is dispensed",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Franklinctycrthsapalchicola01.jpg/200px-Franklinctycrthsapalchicola01.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dcourthouse", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 123,
            osmKey = "amenity",
            osmValue = "post_box",
            nameEn = "Post box",
            descriptionEn = "A box for the reception of mail. Alternative mail-carriers can be tagged via operator=*",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/5/55/Post_Box.JPG/200px-Post_Box.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dpost_box", // FIX
            osmDynamicTags = listOf("Drive through",	"Operator",	 "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 124,
            osmKey = "amenity",
            osmValue = "townhall",
            nameEn = "Townhall",
            descriptionEn = "Building where the administration of a village, town or city may be located, or just a community meeting place",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/TownHall-Ljubljana.JPG/200px-TownHall-Ljubljana.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dtownhall", // FIX
            osmDynamicTags = listOf("Operator",	"Building",),
        ),
        OsmType(
            osmTypeId = 125,
            osmKey = "amenity",
            osmValue = "toilets",
            nameEn = "Toilets",
            descriptionEn = "Public toilets (might require a fee)",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/WC-Anlage.jpg/200px-WC-Anlage.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dtoilets", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Wheelchair",	"Fee",),
        ),
        OsmType(
            osmTypeId = 126,
            osmKey = "amenity",
            osmValue = "internet_cafe",
            nameEn = "Internet Café",
            descriptionEn = "A place whose principal role is providing internet services to the public.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Cafe_internet_uninorte.JPG/200px-Cafe_internet_uninorte.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dinternet_cafe", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Outdoor seating", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 127,
            osmKey = "amenity",
            osmValue = "monastery",
            nameEn = "Monastery",
            descriptionEn = "Monastery is the location of a monastery or a Building in which monks and nuns live.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kloster_Eibingen01.JPG/200px-Kloster_Eibingen01.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dmonastery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Building",),
        ),
        OsmType(
            osmTypeId = 128,
            osmKey = "craft",
            osmValue = "atelier",
            nameEn = "Atelier",
            descriptionEn = "A place where visual artists work",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Atelierstockholm3.jpg/100px-Atelierstockholm3.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Datelier", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 129,
            osmKey = "craft",
            osmValue = "blacksmith",
            nameEn = "Blacksmith",
            descriptionEn = "A place where a blacksmith forges tools, horseshoes, etc. from iron.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Kov%C3%A1%C5%99_p%C5%99i_pr%C3%A1ci_%28Velikono%C4%8Dn%C3%AD_trhy_na_V%C3%A1clavsk%C3%A9m_n%C3%A1m%C4%9Bst%C3%AD%29_055.jpg/100px-Kov%C3%A1%C5%99_p%C5%99i_pr%C3%A1ci_%28Velikono%C4%8Dn%C3%AD_trhy_na_V%C3%A1clavsk%C3%A9m_n%C3%A1m%C4%9Bst%C3%AD%29_055.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dblacksmith", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 130,
            osmKey = "craft",
            osmValue = "brewery",
            nameEn = "Brewery",
            descriptionEn = "A dedicated Building for the making of beer.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Erzquell_Brauerei_Bielstein_Braukessel.JPG/100px-Erzquell_Brauerei_Bielstein_Braukessel.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dbrewery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Microbrewery",	"Brewery",	"Building", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 131,
            osmKey = "craft",
            osmValue = "carpenter",
            nameEn = "Carpenter",
            descriptionEn = "A workplace or office of carpenters that work with timber to construct, install and maintain Buildings, furniture, and other objects.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Carpenter_working_on_the_Warrior_Transition_Unit.jpg/100px-Carpenter_working_on_the_Warrior_Transition_Unit.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dcarpenter", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 132,
            osmKey = "craft",
            osmValue = "cleaning",
            nameEn = "Cleaning",
            descriptionEn = "Workplace or office of a person who cleaning Building, industrial facilities or windows.",
            imageName = "https://cdn.pixabay.com/photo/2015/03/03/18/39/vacuum-cleaner-657719__340.jpg",
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dcleaning", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 133,
            osmKey = "craft",
            osmValue = "electronics_repair",
            nameEn = "Electronics repair",
            descriptionEn = "Repair shops and service centers which provides repair of computers, phones, appliance etc.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Soldering_a_0805.jpg/100px-Soldering_a_0805.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Delectronics_repair", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",	 "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 134,
            osmKey = "craft",
            osmValue = "electrician",
            nameEn = "Electrician",
            descriptionEn = "A person or company that works with electricity or electrical systems.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/US_Navy_100520-N-8913A-096_Interior_Communications_Electricians_3rd_Class_Rory_J._Shisler%2C_left%2C_and_Larry_O._Hughes_perform_maintenance_on_the_internal_phone_system_aboard_USS_George_H.W._Bush_%28CVN_77%29.jpg/100px-thumbnail.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Delectrician", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 135,
            osmKey = "craft",
            osmValue = "goldsmith",
            nameEn = "Goldsmith",
            descriptionEn = "The workplace of a person who forges things out of gold, especially jewelry.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/c/c9/Si_Satchanalai_Goldsmith.jpg/100px-Si_Satchanalai_Goldsmith.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dgoldsmith", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 136,
            osmKey = "craft",
            osmValue = "jeweller",
            nameEn = "Jeweller",
            descriptionEn = "A place where necklaces, rings, brooches, earrings and bracelets and other personal adornments are created or repaired.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Ian_Rosenberg_Jeweller_-_Sapphire_and_gold_ring.JPG/100px-Ian_Rosenberg_Jeweller_-_Sapphire_and_gold_ring.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Djeweller", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 137,
            osmKey = "craft",
            osmValue = "locksmith",
            nameEn = "Locksmith",
            descriptionEn = "A place where locks and keys are created or repaired.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/4/42/Locksmiths.jpg/100px-Locksmiths.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dlocksmith", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 138,
            osmKey = "craft",
            osmValue = "painter",
            nameEn = "Painter",
            descriptionEn = "A workplace or office of a house painter which is a tradesman responsible for the painting and decorating of Buildings.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Painter_paints_a_room_arp.jpg/100px-Painter_paints_a_room_arp.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dpainter", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 139,
            osmKey = "craft",
            osmValue = "photographer",
            nameEn = "Photographer",
            descriptionEn = "A workplace or office of a person who takes photographs using a camera.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Foto_Studio.jpg/100px-Foto_Studio.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dphotographer", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 140,
            osmKey = "craft",
            osmValue = "plumber",
            nameEn = "Plumber",
            descriptionEn = "A workplace or office of a skilled tradesperson who specializes in (drinking) water supply, sewage and drainage systems",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Matchfit_Plumbing_Competition.jpg/100px-Matchfit_Plumbing_Competition.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dplumber", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 141,
            osmKey = "craft",
            osmValue = "pottery",
            nameEn = "Pottery",
            descriptionEn = "A place where earthenware, stoneware and porcelain and other ceramic ware is made by potters.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Pottery_Making.JPG/100px-Pottery_Making.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dpottery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 142,
            osmKey = "craft",
            osmValue = "shoemaker",
            nameEn = "Shoemaker",
            descriptionEn = "A place where shoes, boots, sandals, clogs and moccasins are created, repaired or altered to fit personal needs.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Shoemaker_working_at_John_Lobb%2C_bespoke_shoe_and_bootmaker%2C_88_Jermyn_Street%2C_London.jpg/100px-Shoemaker_working_at_John_Lobb%2C_bespoke_shoe_and_bootmaker%2C_88_Jermyn_Street%2C_London.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dshoemaker", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 143,
            osmKey = "craft",
            osmValue = "watchmaker",
            nameEn = "Watchmaker",
            descriptionEn = "A watchmaker is an artisan who makes and repairs watches. Today due to industrial production they mostly repair watches.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/The_Watchmaker_-_The_joy_of_learning_what_makes_things_tick.jpg/100px-The_Watchmaker_-_The_joy_of_learning_what_makes_things_tick.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag%3Acraft%3Dwatchmaker", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator",),
        ),
        OsmType(
            osmTypeId = 144,
            osmKey = "leisure",
            osmValue = "bandstand",
            nameEn = "Bandstand",
            descriptionEn = "An open structure where musical bands can perform concerts.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/HornimanBandstandsmall.jpg/200px-HornimanBandstandsmall.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dbandstand", // FIX
            osmDynamicTags = listOf("Building",	"Covered",),
        ),
        OsmType(
            osmTypeId = 145,
            osmKey = "leisure",
            osmValue = "bowling_alley",
            nameEn = "Bowling alley",
            descriptionEn = "A facility that is equipped to play the game of bowling.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/North_Korea_Bowling_Alley.jpg/200px-North_Korea_Bowling_Alley.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dbowling_alley", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 146,
            osmKey = "leisure",
            osmValue = "firepit",
            nameEn = "Firepit",
            descriptionEn = "A permanent location or structure to host campfires, bonfires, etc.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/e/e0/Camp_site.jpg/200px-Camp_site.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dfirepit", // FIX
            osmDynamicTags = listOf(),
        ),
        OsmType(
            osmTypeId = 147,
            osmKey = "leisure",
            osmValue = "fitness_station",
            nameEn = "Fitness station",
            descriptionEn = "A place with exercise machines, single or collection of, outdoor.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Outdoor_gym_in_Parque_de_Bateria%2C_Torremolinos.JPG/200px-Outdoor_gym_in_Parque_de_Bateria%2C_Torremolinos.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dfitness_station", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Operator",),
        ),
        OsmType(
            osmTypeId = 148,
            osmKey = "leisure",
            osmValue = "golf_course",
            nameEn = "Golf course",
            descriptionEn = "A golf course.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Spanish-Bay-First-Tee.jpg/200px-Spanish-Bay-First-Tee.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dgolf_course", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Golf course",	"Golf par",),
        ),
        OsmType(
            osmTypeId = 149,
            osmKey = "leisure",
            osmValue = "ice_rink",
            nameEn = "Ice rink",
            descriptionEn = "A place where you can skate or play ice hockey.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Icerink2.jpg/200px-Icerink2.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dice_rink", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Building",),
        ),
        OsmType(
            osmTypeId = 150,
            osmKey = "leisure",
            osmValue = "marina",
            nameEn = "Marina",
            descriptionEn = "For mooring leisure yachts and motor boats.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/6/69/Marina.jpg/200px-Marina.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dmarina", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Capacity",),
        ),
        OsmType(
            osmTypeId = 151,
            osmKey = "leisure",
            osmValue = "nature_reserve",
            nameEn = "Nature reserve",
            descriptionEn = "Protected area of importance for wildlife, flora, fauna or features of geological or other special interest.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Black_Opal_Spring_in_Biscuit_Basin.JPG/200px-Black_Opal_Spring_in_Biscuit_Basin.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dnature_reserve", // FIX
            osmDynamicTags = listOf(),
        ),
        OsmType(
            osmTypeId = 152,
            osmKey = "leisure",
            osmValue = "picnic_table",
            nameEn = "Picnic table",
            descriptionEn = "A picnic table",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Picnic_table.jpg/200px-Picnic_table.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dpicnic_table", // FIX
            osmDynamicTags = listOf(),
        ),
        OsmType(
            osmTypeId = 153,
            osmKey = "leisure",
            osmValue = "pitch",
            nameEn = "Pitch",
            descriptionEn = "A field for playing football, soccer, cricket, baseball, tennis, etc., a riding arena or a skate park. To describe what kind of sport(s) use sport=*.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/County-Ground-STFC-pitch-2006.JPG/200px-County-Ground-STFC-pitch-2006.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dpitch", // FIX
            osmDynamicTags = listOf("Sport",),
        ),
        OsmType(
            osmTypeId = 154,
            osmKey = "leisure",
            osmValue = "resort",
            nameEn = "Resort",
            descriptionEn = "A place used for relaxation or recreation, attracting visitors for vacations, tourism and/or going swimming in a pool and/or a nearby body of water.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Town_and_Country_fh000023.jpg/200px-Town_and_Country_fh000023.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dresort", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",),
        ),
        OsmType(
            osmTypeId = 155,
            osmKey = "leisure",
            osmValue = "sports_centre",
            nameEn = "Sports centre",
            descriptionEn = "A distinct facility where a range of sports take place within an enclosed area. To describe what kind of sport(s) use sport=*.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Western_Leisure_Centre%2C_Cardiff%2C_Wales.jpg/200px-Western_Leisure_Centre%2C_Cardiff%2C_Wales.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dsports_centre", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Fee",	"Operator",	"Sport",),
        ),
        OsmType(
            osmTypeId = 156,
            osmKey = "leisure",
            osmValue = "sports_hall",
            nameEn = "Sports hall",
            descriptionEn = "A Building that is used as a sports hall.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/%E9%AB%94%E8%82%B2%E9%A4%A8%E7%9A%84%E7%B1%83%E7%90%83%E5%A0%B4_-_panoramio.jpg/200px-%E9%AB%94%E8%82%B2%E9%A4%A8%E7%9A%84%E7%B1%83%E7%90%83%E5%A0%B4_-_panoramio.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:leisure%3Dsports_hall", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Sport",),
        ),
        OsmType(
            osmTypeId = 157,
            osmKey = "shop",
            osmValue = "perfumery",
            nameEn = "Perfumery",
            descriptionEn = "A shop selling perfumes.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/301_perfumery_and_drugstore_in_Cala_Millor.jpg/400px-301_perfumery_and_drugstore_in_Cala_Millor.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dperfumery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 159,
            osmKey = "shop",
            osmValue = "lighting",
            nameEn = "Lighting",
            descriptionEn = "A shop selling lighting fixtures and lamps.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Lamp_Shop_in_Bigastro.jpg/400px-Lamp_Shop_in_Bigastro.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dlighting", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Wheelchair",	"Operator", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 160,
            osmKey = "historic",
            osmValue = "castle",
            nameEn = "Castle",
            descriptionEn = "Used for various kinds of castles, palaces, fortresses, manors, stately homes, kremlins, shiros and other.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Castillo_de_Montuenga%2C_Montuenga_de_Soria%2C_Soria%2C_Espa%C3%B1a%2C_2017-05-23%2C_DD_04.jpg/400px-Castillo_de_Montuenga%2C_Montuenga_de_Soria%2C_Soria%2C_Espa%C3%B1a%2C_2017-05-23%2C_DD_04.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:historic%3Dcastle", // FIX
            osmDynamicTags = listOf("Wikidata",	"Castle type",),
        ),
        OsmType(
            osmTypeId = 161,
            osmKey = "historic",
            osmValue = "monument",
            nameEn = "Monument",
            descriptionEn = "A memorial object, which is especially large, built to remember, show respect to a person or group of people or to commemorate an event.",
            imageName = "https://wiki.openstreetmap.org/w/images/f/ff/Monument.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:historic%3Dmonument", // FIX
            osmDynamicTags = listOf("Wikidata",	"Historic civilization",	"Heritage",),
        ),
        OsmType(
            osmTypeId = 162,
            osmKey = "historic",
            osmValue = "rune_stone",
            nameEn = "Rune stone",
            descriptionEn = "Stones, boulders or bedrock with historical runic inscriptions.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/a/af/Trikvetra.JPG/400px-Trikvetra.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:historic%3Drune_stone", // FIX
            osmDynamicTags = listOf("Name", "Wikidata",),
        ),
        OsmType(
            osmTypeId = 163,
            osmKey = "landuse",
            osmValue = "cemetery",
            nameEn = "Cemetary",
            descriptionEn = "A place where people, or sometimes animals are buried that isn't part of a place of worship",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Jewish_cemetery_Worms.jpg/400px-Jewish_cemetery_Worms.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:landuse%3Dcemetery", // FIX
            osmDynamicTags = listOf("Name", "Religion",	"Denomination",),
        ),
        OsmType(
            osmTypeId = 164,
            osmKey = "amenity",
            osmValue = "grave_yard",
            nameEn = "Graveyard",
            descriptionEn = "A place where people (or sometimes animals) are buried which is close to a place of worship.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/1/1d/Odenbuell_Nordstrand_St_Vinzenz_IMGP2940_wp_crop.jpg/400px-Odenbuell_Nordstrand_St_Vinzenz_IMGP2940_wp_crop.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:landuse%3Dcemetery", // FIX
            osmDynamicTags = listOf("Name", "Religion",	"Denomination",),
        ),
        OsmType(
            osmTypeId = 165,
            osmKey = "amenity",
            osmValue = "pub",
            nameEn = "Pub",
            descriptionEn = "An establishment that sells alcoholic drinks that can be consumed on the premises, characterised by a traditional appearance and a relaxed atmosphere. Also sells food which also can be eaten on the premises. Customers can usually sit down at a table.",
            imageName = "https://wiki.openstreetmap.org/w/images/thumb/2/2e/Pub.jpg/400px-Pub.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dpub", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours",	"Phone",	"Website",	"Cuisine",	"Diet",	"Wheelchair",	"Microbrewery",	"Brewery",	"Distillery",	"Drink", "Brand", "Brand website"),
        ),
        OsmType(
            osmTypeId = 166,
            osmKey = "shop",
            osmValue = "glaziery",
            nameEn = "glaziery",
            descriptionEn = "A shop selling and installing glazing for windows and doors.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Double_glazed_Units.JPG/300px-Double_glazed_Units.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop%3Dglaziery", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair",),
        ),
        /*OsmType(
            osmTypeId = 167,
            osmKey = "tourism",
            osmValue = "attraction",
            nameEn = "attraction",
            descriptionEn = "An object of interest for a tourist, or a purpose-built tourist attraction.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Paris_06_Eiffelturm_4828.jpg/300px-Paris_06_Eiffelturm_4828.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:tourism%3Dattraction", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair",),
        ),*/
        OsmType(
            osmTypeId = 167,
            osmKey = "historic",
            osmValue = "house",
            nameEn = "house",
            descriptionEn = "A historic house",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/JethroWoodHouse2.jpg/300px-JethroWoodHouse2.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:historic%3Dhouse", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair", "tourism", "access", "start_date", "wikipedia"),
        ),
        OsmType(
            osmTypeId = 168,
            osmKey = "shop",
            osmValue = "car_repair",
            nameEn = "Car repair",
            descriptionEn = "A business where cars are repaired.",
            imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Hebeb%C3%BChne.JPG/300px-Hebeb%C3%BChne.JPG", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:shop=car_repair", // FIX
            osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair"),
        ),
        OsmType(
            osmTypeId = 169,
            osmKey = "disused:shop",
            osmValue = "yes",
            nameEn = "Empty store/office premises",
            descriptionEn = "Specifies if feature is disused but in a reasonable state of repair.",
            imageName = "https://wiki.openstreetmap.org/wiki/File:Disused-pub.jpg", //FIX,
            osmUrl = "https://wiki.openstreetmap.org/wiki/Key:disused", // FIX
            osmDynamicTags = listOf("Wheelchair"), //Address
        ),
    )

    val osmType = OsmType(
        osmTypeId = 1,
        osmKey = "amenity",
        osmValue = "bar",
        nameEn = "Bar",
        descriptionEn = "Bar is a purpose-built commercial establishment that sells alcoholic drinks to be consumed on the premises. They are characterised by a noisy and vibrant atmosphere, similar to a party and usually don't sell food.",
        imageName = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Bar_MXCT.JPG/800px-Bar_MXCT.JPG",
        osmUrl = "https://wiki.openstreetmap.org/wiki/Tag:amenity%3Dbar",
        osmDynamicTags = listOf("Name", "Opening Hours", "Phone", "Website", "Wheelchair", "Microbrewery", "Brewery", "Brand", "Brand website")
    )

    fun getTypeById(typeId: Int): OsmType? {
        return allTypes.firstOrNull {it.osmTypeId == typeId}
    }
}
