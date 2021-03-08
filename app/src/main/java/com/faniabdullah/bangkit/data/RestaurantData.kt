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

    private val menus = arrayOf(
            "Paket rosemary,\n Toastie salmon,\n Bebek crepes,\n Salad lengkeng,",
            "Kari kacang dan telur \n Ikan teri dan roti \n roket penne \n Salad lengkeng \n Tumis leek  Salad yuzu \n Sosis squash dan mint,",
            "Salad lengkeng,\n Kari terong,\n Sosis squash dan mint,\n Napolitana,\n Salad yuzu,\n Tumis leek,\n Ikan teri dan roti,\n Kari kacang dan telur,\n Toastie salmon,\n Bebek crepes,\n Paket rosemary,\n Sup Kohlrabi,\n roket penne",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Kari kacang dan telur \n Ikan teri dan roti \n roket penne \n Salad lengkeng \n Tumis leek  Salad yuzu \n Sosis squash dan mint,",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
            "Salad lengkeng\n Sosis squash dan mint\n Toastie salmon\n Salad yuzu\n Matzo farfel\n Kari terong\n roket penne\n Napolitana\n Daging Sapi\n Bebek crepes\n Sup Kohlrabi\n Ikan teri dan roti\n Tumis leek\n ",
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

    private val description = arrayOf(
            "Melting Pot bermula dari usaha yang didirikan di garasi rumah Ny. Swan Kumarga pada tahun 1988 dan hingga kini berkembang, selain lima cabang restoran, telah hadir juga layanan delivery nasi kotak sejabodetabek di bawah nama Melting Pot Lunch Box. Dengan visi melestarikan budaya Indonesia terutama makanan tradisional Jawa khas Solo, kami berkomitmen akan terus mengembangkan kualitas produk kami melalui pelayanan yang prima oleh segenap sumber daya manusia kami yang berkarakter bangsa Indonesia",
            "Kafe Kita  coffee break sangatlah diperlukan. Di sesi ini, ketegangan selama acara berlangsung dapat dicairkan. Untuk membuat coffee break acara Anda lebih spesial, Kopi Kulo bisa jadi opsi yang tepat. Sajian yang ditawarkan kopi kulo tidak terbatas pada kopi hitam atau kopi susu saja, melainkan juga campuran kopi dengan lemon, campuran kopi dengan alpukat dan es krim, serta aneka pilihan kopi lainnya..",
            "Bring Your Phone Cafe s a coffee-house-style food and beverage chain, owned by McDonald's. ... Reports indicated that McCafé outlets generated 15% more revenue than a regular McDonald's and, by 2003, were the largest coffee shop brand in Australia and New Zealand.  ",
            "Kafein Unakaffe Cafetiero merupakan campuran biji kopi Arabika Kolombia & Guatemala. Cafetiero kami memiliki aroma karamel dan kacang-kacangan yang lembut, tingkat kepekatan yang lebih ringan, serta rasa jeruk yang menyegarkan. Excelso Unakaffe menawarkan cara baru membuat secangkir kopi berkualitas  ",
            "Istana Emas menawarkan cita rasa masakan tradisional khas rumahan. Menu yang ditawarkan tidak terbatas pada pecel blitar saja, namun sangat bervariasi. Ada rawon, gudeg, ayam kremes, soto, rujak cingur, empal, aneka ikan, dan menu lainnya. Tidak hanya lauk-pauk yang beragam, Anda yang merindukan jajanan tradisonal seperti bubur sumsum, ketan hitam, candil, dan beraneka kue bisa memesan langsung hidangan kesayangan Anda di Bakoel Pecel Blitar..",
            "Makan mudah  Healthy Culture bikin makanan sehat terasa lezat dengan harga yang sangat terjangkau!.\n",
            "Drinky Squash s a Indonesian cafe restaurant chain that specializes in donuts, coffee and frozen yogurt. The company is owned and managed by Johnny Andrean Group.",
            "Ampiran Kota merupakan artisan French bakery yang menghadirkan roti, kue, dan pastry ala Perancis. Sajian ala Sophie Authentique ini sangatlah khas, fresh, dan bercita rasa tinggi, pas sekali untuk dinikmati di waktu senggang acara Anda. Menu-menu rekomendasi yang wajib Anda coba, antara lain canele, vanilla beignet, chocolate croissant, dan masih banyak lagi!",
            "Gigitan Cepat  restoran yang menyajikan menu ayam dengan berbagai pilihan rasa. Sejak kehadirannya pada 2012, Finger dipercaya sebagai salah satu restoran berkualitas tinggi dengan pelayanan terbaik yang terjangkau harganya. Beberapa menu dari Finger yang wajib Anda coba antara lain black pepper chicken, butter rice, dan salted egg..",
            "Tempat Siang Hari  Restoran berbentuk kepompong dari bambu yang menawan dan romantis menyediakan variasi menu French, indonesia dan germany ",
            "Fairy Cafe coffee break sangatlah diperlukan. Di sesi ini, ketegangan selama acara berlangsung dapat dicairkan. Untuk membuat coffee break acara Anda lebih spesial, Kopi Kulo bisa jadi opsi yang tepat. Sajian yang ditawarkan kopi kulo tidak terbatas pada kopi hitam atau kopi susu saja, melainkan juga campuran kopi dengan lemon, campuran kopi dengan alpukat dan es krim, serta aneka pilihan kopi lainnya.. ",
            "Rumah Senja di sini kamu bisa habiskan waktu berharga bareng sahabat, pacar sambil menikmati indahnya senja dan kopi cappuccino dari menu kita",
            "Saya Suka menawarkan cita rasa masakan tradisional khas rumahan. Menu yang ditawarkan tidak terbatas pada kopi dan makanan saja namun ada makanan sesuka hati anda dan kami akan menyajikannya",
            "Hub Grubber  merupakan katering dan restaurant yang menyediakan banyak variasi menu masakan nusantara, asia, dan western. Berbeda dari katering lainnya, Eatever tidak hanya menyediakan pesanan dalam kuantitas besar, melainkan juga menyediakan daily catering yang dapat dipesan satuan tanpa minimum order. Sejak berdiri pada Juli 2017 hingga saat ini, Eatever telah dipercaya banyak pelanggan setianya untuk melayani berbagai kebutuhan kuliner mereka. ",
            "Kafe Cemara Paling penting, di sini kamu bisa habiskan waktu berharga bareng sahabat, pacar, partner bisnis (buat ngomongin mimpi-mimpi kamu di masa depan) sambil main UNO, denger playlist heitzz masa kinih, main ular tangga, atau sekedar wifi-an buat main mobile games bareng. ",
            "Manis Asam Kafe coffee break sangatlah diperlukan. Di sesi ini, ketegangan selama acara berlangsung dapat dicairkan. Untuk membuat coffee break acara Anda lebih spesial, Kopi Kulo bisa jadi opsi yang tepat. Sajian yang ditawarkan kopi kulo tidak terbatas pada kopi hitam atau kopi susu saja, melainkan juga campuran kopi dengan lemon, campuran kopi dengan alpukat dan es krim, serta aneka pilihan kopi lainnya..",
            "Run The Gun coffee  Kopi Kulo bisa jadi opsi yang tepat. Sajian yang ditawarkan kopi kulo tidak terbatas pada kopi hitam atau kopi susu saja, melainkan juga campuran kopi dengan lemon, campuran kopi dengan alpukat dan es krim, serta aneka pilihan kopi lainnya..",
            "Bobby menyediakan berbagai menu masakan nusantara juga mancanegara dengan pilihan vegetarian dan non-vegetarian.Ada nasi kotak dengan berbagai lauk pauk, nasi bakar, hingga tumpeng. Selain makanan utama, untuk melengkapi acara Anda,Adora juga menyediakan berbagai cemilan ringan yang bervariasi, seperti salad buah, takoyaki, dim sum, kelepon, singkong Thailand, pancake durian, dan berbagai menu lezat lainnya..",
            "Pangsit Express merupakan salah satu katering sehat yang punya varian menu. Hidangan yang ditawarkan sangatlah bervariasi, dari nasi dengan anek lauk pauk, aneka pasta, sampai aneka salad juga ada. Healthy Culture bikin makanan sehat terasa lezat dengan harga yang sangat terjangkau!",
            "Gigitan Makro menyediakan berbagai menu masakan nusantara juga mancanegara dengan pilihan vegetarian dan non-vegetarian Ada nasi kotak dengan berbagai lauk pauk, nasi bakar, hingga tumpeng. Selain makanan utama, untuk melengkapi acara Anda,Adora juga menyediakan berbagai cemilan ringan yang bervariasi, seperti salad buah, takoyaki, dim sum, kelepon, singkong Thailand, pancake durian, dan berbagai menu lezat lainnya..",
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
                    restaurant.description = description[position]
                    restaurant.menus = menus[position]
                    restaurant.city = city[position]
                    restaurant.image = pictureId[position]
                    restaurant.rating = rating[position]
                    list.add(restaurant)
                }
                return list
            }
}