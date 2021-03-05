package com.faniabdullah.bangkit

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniabdullah.bangkit.adapter.RestaurantAdapter
import com.faniabdullah.bangkit.data.RestaurantData
import com.faniabdullah.bangkit.model.Restaurant
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var rvListRestaurant: RecyclerView
    private var list: ArrayList<Restaurant> = arrayListOf()
    private lateinit var edtSearchRestaurant : TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvListRestaurant = findViewById(R.id.rv_list_restaurant)
        rvListRestaurant.setHasFixedSize(true)
        edtSearchRestaurant =findViewById(R.id.edt_search_restaurant)
        list.addAll(RestaurantData.listData)
        showListRestaurant()
    }

    private fun showListRestaurant() {
        rvListRestaurant.layoutManager = LinearLayoutManager(this)

        val listRestaurantAdapter = RestaurantAdapter(list,this)
        rvListRestaurant.adapter = listRestaurantAdapter

        listRestaurantAdapter.setOnItemClickCallback(object : RestaurantAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Restaurant) {
                showSelectedRestaurant(data)
            }
        })

        edtSearchRestaurant.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
            override fun afterTextChanged(s: Editable?) {
                val dataRestaurantFiltered: ArrayList<Restaurant> = arrayListOf()
                for (data in RestaurantData.listData) {
                    val warteg: String = data.name.toString().toLowerCase()
                    if (warteg.contains(s.toString().toLowerCase())) {
                        dataRestaurantFiltered.add(data)
                    }
                }
                    listRestaurantAdapter.filter(dataRestaurantFiltered)
            }
        })
    }

    private fun showSelectedRestaurant(data: Restaurant) {
        Toast.makeText(this, "kamu memilih " + data.name, Toast.LENGTH_SHORT).show();
    }

}



