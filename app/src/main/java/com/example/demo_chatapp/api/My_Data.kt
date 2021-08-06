package com.example.demo_chatapp.api

data class My_Data(
    val privacy: String,
    val quotes: Quotes,
    val source: String,
    val success: Boolean,
    val terms: String,
    val timestamp: Int
)