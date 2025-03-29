package com.jorgeguerra.fakestoremvvm.store.presentation.products_screen

import com.jorgeguerra.fakestoremvvm.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)
