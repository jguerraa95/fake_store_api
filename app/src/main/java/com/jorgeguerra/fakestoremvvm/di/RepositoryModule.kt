package com.jorgeguerra.fakestoremvvm.di

import com.jorgeguerra.fakestoremvvm.store.data.repository.ProductsRepositoryImpl
import com.jorgeguerra.fakestoremvvm.store.domain.repository.ProductsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)

abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindProductsRepository(impl: ProductsRepositoryImpl): ProductsRepository

}