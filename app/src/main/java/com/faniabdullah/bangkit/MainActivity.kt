package com.faniabdullah.bangkit

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniabdullah.bangkit.adapter.RestaurantAdapter
import com.faniabdullah.bangkit.data.RestaurantData
import com.faniabdullah.bangkit.model.Restaurant
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var rvListRestaurant: RecyclerView
    private var list: ArrayList<Restaurant> = arrayListOf()
    private lateinit var edtSearchRestaurant : TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
        list.addAll(RestaurantData.listData)
        showListRestaurant()
        setNavigation()
    }

    private fun initComponent() {
        rvListRestaurant = findViewById(R.id.rv_list_restaurant)
        rvListRestaurant.setHasFixedSize(true)
        edtSearchRestaurant =findViewById(R.id.edt_search_restaurant)
    }

    private fun setNavigation() {
        val navView: BottomNavigationView = findViewById(R.id.navigation)
        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_bookmarked -> {
                    val moveIntent = Intent ( this@MainActivity , BookmarkActivity :: class.java )
                    startActivity ( moveIntent )
                    true
                }
                R.id.action_profile -> {
                    val moveIntent = Intent ( this@MainActivity , MyProfileActivity :: class.java )
                    startActivity ( moveIntent )
                    true
                }
                else -> true
            }
        }
    }

    private fun showListRestaurant() {
        rvListRestaurant.layoutManager = LinearLayoutManager(this)

        val listRestaurantAdapter = RestaurantAdapter(list,this)
        rvListRestaurant.adapter = listRestaurantAdapter

        listRestaurantAdapter.setOnItemClickCallback(object : RestaurantAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Restaurant) {
                showDetailRestaurant(data)
            }
        })

        edtSearchRestaurant.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
            override fun afterTextChanged(seachValue: Editable?) {
                val dataRestaurantFiltered: ArrayList<Restaurant> = arrayListOf()
                for (data in RestaurantData.listData) {
                    val restaurant: String = data.name.toString().toLowerCase()
                    if (restaurant.contains(seachValue.toString().toLowerCase())) {
                        dataRestaurantFiltered.add(data)
                    }
                }
                    listRestaurantAdapter.filter(dataRestaurantFiltered)
            }
        })
    }

    private fun showDetailRestaurant(data: Restaurant) {
        val intentDetail = Intent(this@MainActivity, DetailRestaurantActivity::class.java)
        intentDetail.putExtra(DetailRestaurantActivity.DETAIL_USER, data)
        startActivity(intentDetail)
    }
}



