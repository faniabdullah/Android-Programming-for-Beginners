package com.faniabdullah.bangkit.data

import com.faniabdullah.bangkit.R
import com.faniabdullah.bangkit.model.Restaurant

object RestaurantData {

        private val name = arrayOf(
                "Melting Pot",
                "Kafe Kita",
                "Bring Your Phone Cafe",
                "Kafein",
                "Istana Emas",
                "Makan mudah",
                "Drinky Squash",
                "Ampiran Kota",
                "Gigitan Cepat",
                "Tempat Siang Hari",
                "Fairy Cafe",
                "Rumah Senja",
                "Saya Suka",
                "Hub Grubber",
                "Kafe Cemara",
                "Manis Asam Kafe",
                "Run The Gun",
                "Bobby",
                "Pangsit Express",
                "Gigitan Makro",
        )

        private val pictureId = intArrayOf(
                R.drawable.melting_pot,
                R.drawable.kafe_kita,
                R.drawable.bring_your_phone,
                R.drawable.kafein,
                R.drawable.istana_emas,
                R.drawable.makan_mudah,
                R.drawable.drinky_squash,
                R.drawable.ampiran_kota,
                R.drawable.gigitan_cepat,
                R.drawable.tempat_siang_hari,
                R.drawable.fairy_cafe,
                R.drawable.rumah_senja,
                R.drawable.saya_suka,
                R.drawable.hub_grubber,
                R.drawable.kafe_cemara,
                R.drawable.manis_asam_kafe,
                R.drawable.runthegun,
                R.drawable.bobby,
                R.drawable.pangsit_express,
                R.drawable.gigitan_makro,
        )

        private val city = arrayOf(
                "Medan",
                "Gorontalo",
                "Surabaya",
                "Aceh",
                "Balikpapan",
                "Medan",
                "Surabaya",
                "Balikpapan",
                "Bali",
                "Surabaya",
                "Surabaya",
                "Bandung",
                "Bandung",
                "Balikpapan",
                "Ternate",
                "Malang",
                "Aceh",
                "Ternate",
                "Surabaya",
                "Surabaya",
        )

        private val rating = doubleArrayOf(
                4.2,
                4.0,
                4.2,
                4.6,
                4.5,
                3.7,
                3.9,
                4.1,
                4.0,
                4.4,
                5.0,
                3.9,
                4.3,
                3.8,
                3.6,
                4.6,
                3.7,
                4.7,
                4.8,
                4.9,
        )



        val listData: ArrayList<Restaurant>
            get() {
                val list = arrayListOf<Restaurant>()
                for (position in name.indices) {
                    val restaurant = Restaurant()
                    restaurant.name = name[position]

                    restaurant.city = city[position]
                    restaurant.image = pictureId[position]
                    restaurant.rating = rating[position]
                    list.add(restaurant)
                }
                return list
            }
}