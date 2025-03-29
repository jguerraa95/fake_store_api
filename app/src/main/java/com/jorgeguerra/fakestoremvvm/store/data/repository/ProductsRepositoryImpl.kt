package com.jorgeguerra.fakestoremvvm.store.data.repository

import arrow.core.Either
import com.jorgeguerra.fakestoremvvm.store.data.mapper.toGeneralError
import com.jorgeguerra.fakestoremvvm.store.data.remote.ProductsApi
import com.jorgeguerra.fakestoremvvm.store.domain.model.NetworkError
import com.jorgeguerra.fakestoremvvm.store.domain.model.Product
import com.jorgeguerra.fakestoremvvm.store.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft {
            it.toGeneralError()
        }
    }
}