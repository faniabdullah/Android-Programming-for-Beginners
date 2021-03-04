package com.faniabdullah.bangkit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniabdullah.bangkit.adapter.RestaurantAdapter
import com.faniabdullah.bangkit.data.RestaurantData
import com.faniabdullah.bangkit.model.Restaurant

class MainActivity : AppCompatActivity() {
    private lateinit var rvListRestaurant: RecyclerView
    private var list: ArrayList<Restaurant> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvListRestaurant = findViewById(R.id.rv_list_restaurant)
        rvListRestaurant.setHasFixedSize(true)

        list.addAll(RestaurantData.listData)
        showListRestaurant()
    }

    private fun showListRestaurant() {
        rvListRestaurant.layoutManager = LinearLayoutManager(this)
        val listRestaurantAdapter = RestaurantAdapter(list)
        rvListRestaurant.adapter = listRestaurantAdapter
    }

}