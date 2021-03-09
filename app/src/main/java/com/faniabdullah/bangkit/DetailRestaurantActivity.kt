package com.faniabdullah.bangkit

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.faniabdullah.bangkit.data.DatabaseHelper
import com.faniabdullah.bangkit.model.Restaurant


class DetailRestaurantActivity : AppCompatActivity() {
    private lateinit var imageViewRestaurant: ImageView
    private lateinit var imageButtonBookmark: ImageButton
    private lateinit var tv_restaurant_name : TextView
    private lateinit var tv_rating_restaurant: TextView
    private lateinit var tv_location_restaurant: TextView
    private lateinit var tv_menu_restaurant: TextView
    private lateinit var tv_description_restaurant: TextView

    companion object {
        const val DETAIL_USER = "detail_restaurant"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_restaurant)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initialComponent()
        val restaurant = intent.getParcelableExtra(DETAIL_USER) as Restaurant?
        supportActionBar?.title = restaurant?.name
        renderDetailRestaurant(restaurant)
    }

    private fun initialComponent() {
        imageViewRestaurant = findViewById(R.id.img_restaurant_detail)
        tv_restaurant_name= findViewById(R.id.restaurant_name)
        tv_rating_restaurant = findViewById(R.id.rating_restaurant)
        tv_location_restaurant = findViewById(R.id.location_restaurant)
        tv_description_restaurant = findViewById(R.id.description_restaurant)
        tv_menu_restaurant = findViewById(R.id.menu_restaurant)
        imageButtonBookmark = findViewById(R.id.icon_bookmark_restaurant)
    }

    private fun renderDetailRestaurant(restaurant: Restaurant?) {
        Glide.with(this)
                .load(restaurant?.image)
                .apply(RequestOptions().override(350, 550))
                .into(imageViewRestaurant)
        tv_restaurant_name.text = restaurant?.name
        tv_rating_restaurant.text = restaurant?.rating.toString()
        tv_location_restaurant.text = restaurant?.city
        tv_description_restaurant.text = restaurant?.description
        tv_menu_restaurant.text = restaurant?.menus
        setRenderButton(restaurant)
    }

    private fun setRenderButton( restaurantData: Restaurant?) {
        val dbHelper = DatabaseHelper(this)
        val res = dbHelper.isExistsData(restaurantData?.name.toString())
        if (res){
            imageButtonBookmark.setBackgroundResource(R.drawable.ic_baseline_bookmark_24)
        }else{
            imageButtonBookmark.setBackgroundResource(R.drawable.ic_baseline_bookmark_border_24)
        }
        imageButtonBookmark.setOnClickListener{ setEvenBookmarked(restaurantData)}
    }

    private fun setEvenBookmarked(restaurantData: Restaurant?) {
        val dbHelper = DatabaseHelper(this)
        val status = dbHelper.isExistsData(restaurantData?.name.toString())
        val state : String?
        if (!status){
            dbHelper.insertData("${restaurantData?.name}")
            imageButtonBookmark.setBackgroundResource(R.drawable.ic_baseline_bookmark_24)
            state = " Has been added to bookmark"
        }else{
            dbHelper.deleteData("${restaurantData?.name}")
            imageButtonBookmark.setBackgroundResource(R.drawable.ic_baseline_bookmark_border_24)
            state = " Has been removed in bookmark"
        }
        Toast.makeText(this, "" + restaurantData?.name + state, Toast.LENGTH_SHORT).show()
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}