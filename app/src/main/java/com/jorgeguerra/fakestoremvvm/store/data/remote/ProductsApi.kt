package com.jorgeguerra.fakestoremvvm.store.data.remote

import com.jorgeguerra.fakestoremvvm.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>
}