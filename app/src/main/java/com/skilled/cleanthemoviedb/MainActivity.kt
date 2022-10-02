package com.skilled.cleanthemoviedb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostController =
            supportFragmentManager.findFragmentById(R.id.nav_host_container) as NavHostFragment

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.main_bottom_nav_menu)
        bottomNavigationView.setupWithNavController(navHostController.navController)

    }
}