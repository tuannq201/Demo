package com.example.demo_chatapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.demo_chatapp.api.Api_demo
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

    fun callApi(view: View) {
        val intent = Intent(this, Api_demo::class.java)
        startActivity(intent)
    }


}