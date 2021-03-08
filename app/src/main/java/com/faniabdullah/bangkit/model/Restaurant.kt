package com.faniabdullah.bangkit.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Restaurant(

        var name: String? = "",
        var description: String? = "",
        var menus: String? = "",

        var image: Int? = 0,
        var city : String? = "",
        var rating : Double? = 0.0,
): Parcelable