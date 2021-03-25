package com.muhammaduzaer.favfoodcollection.activities.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.muhammaduzaer.favfoodcollection.R
import com.muhammaduzaer.favfoodcollection.databinding.ActivityMainBinding
import com.muhammaduzaer.favfoodcollection.extensions.gone
import com.muhammaduzaer.favfoodcollection.extensions.visible

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var bottomNavMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        navController = findNavController(R.id.navHostFragment)
        bottomNavMenu = mainBinding.bottomNav
        bottomNavMenu.setupWithNavController(navController)
        
        mainBinding.floatingActionBtnAddItem.setOnClickListener{
            navController.navigate(R.id.addNewItemFragment)
        }

    }

    fun hideIncludes() {
        mainBinding.bottomNav.gone()
        mainBinding.floatingActionBtnAddItem.gone()
    }

    fun showIncludes() {
        mainBinding.bottomNav.visible()
        mainBinding.floatingActionBtnAddItem.visible()
    }

}