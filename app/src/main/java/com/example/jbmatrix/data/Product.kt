package com.example.jbmatrix.data

data class ApiResponse(
    val status: String,
    val data: List<Product>
)

data class Product(
    val product_id: String,
    val product_name: String,
    val product_title: String,
    val image1: String,
    val image2: String,
    val price: String,
    val strike_price: String,
    val total_tax: String,
    val price_tax: String,
    val stock: Int
)
