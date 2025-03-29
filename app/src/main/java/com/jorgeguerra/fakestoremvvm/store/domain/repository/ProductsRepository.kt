package com.jorgeguerra.fakestoremvvm.store.domain.repository

import arrow.core.Either
import com.jorgeguerra.fakestoremvvm.store.domain.model.NetworkError
import com.jorgeguerra.fakestoremvvm.store.domain.model.Product

interface ProductsRepository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}