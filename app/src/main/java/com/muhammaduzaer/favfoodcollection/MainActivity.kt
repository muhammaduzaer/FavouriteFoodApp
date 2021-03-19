package com.muhammaduzaer.favfoodcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.muhammaduzaer.favfoodcollection.databinding.ActivityMainBinding
import com.muhammaduzaer.favfoodcollection.extensions.gone
import com.muhammaduzaer.favfoodcollection.extensions.visible

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        navController = findNavController(R.id.fragmentContainerView)

    }

    fun hideIncludes() {
        mainBinding.bottomNav.gone()
    }

    fun showIncludes() {
        mainBinding.bottomNav.visible()
    }

}