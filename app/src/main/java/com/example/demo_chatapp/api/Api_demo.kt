package com.example.demo_chatapp.api

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demo_chatapp.R
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api_demo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_demo)

    }

    public fun getMyData(view: View) {
        var terms: TextView = findViewById(R.id.tv_terms)
        var source: TextView = findViewById(R.id.tv_source)
        var usdvnd: TextView = findViewById(R.id.tv_usdvnd)

        val client = OkHttpClient.Builder().build()
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("http://apilayer.net/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build().create(Api_interface::class.java)

        // http://apilayer.net/api/live?access_key=843d4d34ae72b3882e3db642c51e28e6&currencies=VND&source=USD&format=1

        val retrofitData = retrofitBuilder.getData("843d4d34ae72b3882e3db642c51e28e6", 0, "VND", "USD")
        retrofitData.enqueue(object : Callback<My_Data> {
            override fun onResponse(call: Call<My_Data>, response: Response<My_Data>) {

                val myData: My_Data = response.body()!!
                if (myData != null){
                    terms
                    terms.text = "Terms: "+myData.terms
                    source.text = "Sourse: "+myData.source
                    usdvnd.text = "USD/VND: "+myData.quotes.USDVND
                    Toast.makeText(applicationContext, "ok", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<My_Data>, t: Throwable) {
                Toast.makeText(applicationContext, "erro", Toast.LENGTH_SHORT).show()
            }


        })

    }
}

