package com.faniabdullah.bangkit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniabdullah.bangkit.adapter.RestaurantAdapter
import com.faniabdullah.bangkit.data.DatabaseHelper
import com.faniabdullah.bangkit.data.RestaurantData
import com.faniabdullah.bangkit.model.Restaurant
import java.util.*
import kotlin.collections.ArrayList

class BookmarkActivity : AppCompatActivity() {
    private lateinit var rvListRestaurant: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)
        rvListRestaurant = findViewById(R.id.rv_list_restaurant)
        val data = getfilteredRestaurantFromSqlLite()
        renderBookmarked(data)
    }

    private fun renderBookmarked(data: ArrayList<Restaurant>) {
        rvListRestaurant.layoutManager = LinearLayoutManager(this)
        val listRestaurantAdapter = RestaurantAdapter(data,this)
        rvListRestaurant.adapter = listRestaurantAdapter
        listRestaurantAdapter.setOnItemClickCallback(object : RestaurantAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Restaurant) {
                showSelectedRestaurant(data)
            }
        })
    }

    private fun getfilteredRestaurantFromSqlLite(): ArrayList<Restaurant> {
        val dbHelper = DatabaseHelper(this)
        val res = dbHelper.allData
        val dataRestaurantFiltered: ArrayList<Restaurant> = arrayListOf()
        for (data in RestaurantData.listData) {
            val restaurantName: String = data.name.toString().toLowerCase()
            res.moveToFirst()
            do
            {
                if (restaurantName.contains(res.getString(1).toLowerCase())) {
                    dataRestaurantFiltered.add(data)
                }
            }
            while (res.moveToNext())
        }

        return dataRestaurantFiltered
    }


    private fun showSelectedRestaurant(data: Restaurant) {
        Toast.makeText(this, "kamu memilih " + data.name, Toast.LENGTH_SHORT).show();
    }
}

