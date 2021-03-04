package com.faniabdullah.bangkit.model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
        var username: String? = "",
        var name: String? = "",
        var avatar: Int? = 0,
        var company: String?= "",
        var location: String?= "",
        var repository: Int? = 0,
        var follower: Int? = 0,
        var following: Int? = 0
): Parcelable