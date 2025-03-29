package com.jorgeguerra.fakestoremvvm.store.data.mapper

import coil.network.HttpException
import com.jorgeguerra.fakestoremvvm.store.domain.model.ApiError
import com.jorgeguerra.fakestoremvvm.store.domain.model.NetworkError
import java.io.IOException

fun Throwable.toGeneralError(): NetworkError{
    val error = when(this){
        is IOException -> ApiError.NetWorkError
        is HttpException -> ApiError.UnknownError
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error = error,
        t = this
    )
}