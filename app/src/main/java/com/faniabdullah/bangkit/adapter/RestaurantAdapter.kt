package com.faniabdullah.bangkit.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.faniabdullah.bangkit.R
import com.faniabdullah.bangkit.data.DatabaseHelper
import com.faniabdullah.bangkit.model.Restaurant

class RestaurantAdapter(private var listRestaurant: ArrayList<Restaurant> , private val context: Context): RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun filter(listRestaurantFiltered: ArrayList<Restaurant>){
        listRestaurant = ArrayList();
        listRestaurant.addAll(listRestaurantFiltered)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_hero, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurantData = listRestaurant[position]
        Glide.with(holder.itemView.context)
                .load(restaurantData.image)
                .apply(RequestOptions().override(350, 550))
                .into(holder.imgPhoto)
        holder.tvName.text = restaurantData.name
        holder.tvRating.text = restaurantData.rating.toString()
        holder.tvLocation.text = restaurantData.city
        holder.layout_restaurant.setOnClickListener { onItemClickCallback.onItemClicked(listRestaurant[holder.adapterPosition]) }
        holder.imageButtonBookmark.setOnClickListener{ setEvenBookmarked(restaurantData)}
    }



    override fun getItemCount(): Int {
        return listRestaurant.size
    }

    inner class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_data_restaurant)
        var tvName: TextView = itemView.findViewById(R.id.tv_restaurant_name)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_location_restaurant)
        var tvRating: TextView = itemView.findViewById(R.id.tv_rating_restaurant)
        var layout_restaurant : ConstraintLayout = itemView.findViewById(R.id.layout_restaurant)
        var imageButtonBookmark : ImageButton = itemView.findViewById(R.id.imageButtonBookmark)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Restaurant)
    }

    private fun setEvenBookmarked(data: Restaurant) {
       var dbHelper = DatabaseHelper(context)
        dbHelper.insertData("${data.name}")
        val res = dbHelper.allData
        val buffer = StringBuffer()
        while (res.moveToNext()) {
            buffer.append("ID :" + res.getString(0) + "\n")
            buffer.append("NAME :" + res.getString(1) + "\n")
        }
        Log.e("tag-","all data "+buffer.toString())
    }


}