package com.faniabdullah.bangkit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.faniabdullah.bangkit.R
import com.faniabdullah.bangkit.model.Restaurant

class RestaurantAdapter(private val listRestaurant: ArrayList<Restaurant>): RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {


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
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listRestaurant[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listRestaurant.size
    }

    inner class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_data_restaurant)
        var tvName: TextView = itemView.findViewById(R.id.tv_restaurant_name)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_location_restaurant)
        var tvRating: TextView = itemView.findViewById(R.id.tv_rating_restaurant)

    }
}