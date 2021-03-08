package com.faniabdullah.bangkit.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniabdullah.bangkit.DetailRestaurantActivity
import com.faniabdullah.bangkit.R
import com.faniabdullah.bangkit.adapter.RestaurantAdapter
import com.faniabdullah.bangkit.data.DatabaseHelper
import com.faniabdullah.bangkit.model.Restaurant

class FragmentBookmark : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_bookmark, container,
                false)

        val activity = activity as Context

        val dbHelper = DatabaseHelper(activity)
        val restaurant = dbHelper.getRestaurantFiltered()
        Log.e("msg","msg sdone "+restaurant)
        renderBookmarked(restaurant,activity,view)

        return view
    }


    private fun showDetailRestaurant(context: Context, data: Restaurant) {
        val intentDetail = Intent(context, DetailRestaurantActivity::class.java)
        intentDetail.putExtra(DetailRestaurantActivity.DETAIL_USER, data)
        startActivity(intentDetail)
    }

    private fun renderBookmarked(data: ArrayList<Restaurant> , context: Context , view: View) {

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_list_restaurant)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val listRestaurantAdapter = RestaurantAdapter(data,context)
        recyclerView.adapter = listRestaurantAdapter
        listRestaurantAdapter.setOnItemClickCallback(object : RestaurantAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Restaurant) {
                showDetailRestaurant(context , data)
            }
        })

    }



}