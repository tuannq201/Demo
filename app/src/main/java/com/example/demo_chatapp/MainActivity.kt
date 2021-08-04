package com.example.demo_chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demo_chatapp.navigation_drawer.NavigationDrawer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Navigation_Drawer(view: View) {
        val intent = Intent(this, NavigationDrawer::class.java)
        startActivity(intent)
    }


}