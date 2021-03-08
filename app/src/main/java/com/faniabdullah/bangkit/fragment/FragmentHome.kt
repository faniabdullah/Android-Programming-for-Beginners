package com.faniabdullah.bangkit.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniabdullah.bangkit.DetailRestaurantActivity
import com.faniabdullah.bangkit.R
import com.faniabdullah.bangkit.adapter.RestaurantAdapter
import com.faniabdullah.bangkit.data.RestaurantData
import com.faniabdullah.bangkit.model.Restaurant
import com.google.android.material.textfield.TextInputEditText

class FragmentHome : Fragment() {

    private lateinit var edtSearchRestaurant : TextInputEditText

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container,
                false)

        var list: ArrayList<Restaurant> = arrayListOf()
        list.addAll(RestaurantData.listData)
        val activity = activity as Context
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_list_restaurant)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val listRestaurantAdapter = RestaurantAdapter(list,activity)
        recyclerView.adapter = listRestaurantAdapter

        listRestaurantAdapter.setOnItemClickCallback(object : RestaurantAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Restaurant) {
                showDetailRestaurant(activity , data)
            }
        })

        giveEventSearchRestaurant(view , listRestaurantAdapter)

        return view
    }

    private fun giveEventSearchRestaurant(view: View,adapter: RestaurantAdapter){

        edtSearchRestaurant =view.findViewById(R.id.edt_search_restaurant)

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
                adapter.filter(dataRestaurantFiltered)
            }
        })
    }


    private fun showDetailRestaurant(context: Context, data: Restaurant) {
        val intentDetail = Intent(context, DetailRestaurantActivity::class.java)
        intentDetail.putExtra(DetailRestaurantActivity.DETAIL_USER, data)
        startActivity(intentDetail)
    }

}