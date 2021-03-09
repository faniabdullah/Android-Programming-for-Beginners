package com.faniabdullah.bangkit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.faniabdullah.bangkit.fragment.FragmentBookmark
import com.faniabdullah.bangkit.fragment.FragmentHome
import com.faniabdullah.bangkit.fragment.FragmentProfile
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(FragmentHome())
        setNavigation()
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun setNavigation() {
        val navView: BottomNavigationView = findViewById(R.id.navigation)
        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_bookmarked -> {
                    supportActionBar?.title = "Bookmark"
                    loadFragment(FragmentBookmark())
                    true
                }
                R.id.action_home -> {
                    supportActionBar?.title = "direstaurant"
                    loadFragment(FragmentHome())
                    true
                }
                R.id.action_profile -> {
                    supportActionBar?.title = "Profile"
                    loadFragment(FragmentProfile())
                    true
                }
                else -> true
            }
        }
    }
}



