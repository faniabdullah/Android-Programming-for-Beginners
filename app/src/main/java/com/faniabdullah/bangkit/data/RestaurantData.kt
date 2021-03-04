package com.faniabdullah.bangkit.data

import com.faniabdullah.bangkit.R
import com.faniabdullah.bangkit.model.Restaurant

object RestaurantData {

        private val username = arrayOf(
                "JakeWharton",
                "amitshekhariitbhu",
                "romainguy",
                "chrisbanes",
                "tipsy",
                "ravi8x",
                "jasoet",
                "budioktaviyan",
                "hendisantika",
                "sidiqpermana"
        )

        private val avatar = intArrayOf(
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
                R.drawable.img_kangkung,
        )

        private val company = arrayOf(
                "Google, Inc.",
                "MindOrksOpenSource",
                "Google",
                "Google working on @android",
                "Working Group Two",
                "AndroidHive | Droid5",
                "gojek-engineering",
                "KotlinID",
                "JVMDeveloperID @KotlinID @IDDevOps",
                "Nusantara Beta Studio"
        )

        private val repository = intArrayOf(
                102,
                37,
                9,
                30,
                56,
                28,
                44,
                110,
                1064,
                65
        )

        private val followers = intArrayOf(
                56995,
                5153,
                7972,
                14725,
                788,
                18628,
                277,
                178,
                428,
                465
        )

        private val following = intArrayOf(
                12,
                2,
                0,
                1,
                0,
                3,
                39,
                23,
                61,
                10
        )

        private val location = arrayOf(
                "Pittsburgh, PA, USA",
                "New Delhi, India",
                "California",
                "Sydney, Australia",
                "Trondheim, Norway",
                "India",
                "Kotagede, Yogyakarta, Indonesia",
                "Jakarta, Indonesia",
                "Bojongsoang - Bandung Jawa Barat",
                "Jakarta Indonesia"
        )

        private val name = arrayOf(
                "Jake Wharton",
                "Amit Shekhar",
                "Romain Guy",
                "Chris Banes",
                "David",
                "Ravi Tamada",
                "Deny Prasetyo",
                "Budi Oktaviyan",
                "Hendi Santika",
                "Sidiq Permana"
        )

        val listData: ArrayList<Restaurant>
            get() {
                val list = arrayListOf<Restaurant>()
                for (position in name.indices) {
                    val user = Restaurant()
                    user.name = name[position]
                    user.username = username[position]
                    user.avatar = avatar[position]
                    user.company = company[position]
                    user.location = location[position]
                    user.follower = followers[position]
                    user.following  = following[position]
                    user.repository  = repository[position]
                    list.add(user)
                }
                return list
            }
}