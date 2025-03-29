package com.jorgeguerra.fakestoremvvm.store.domain.model

data class NetworkError(
    val error: ApiError,
    val t: Throwable? = null
)

enum class ApiError(val message: String){
    NetWorkError("Network Error"),
    UnknownResponse("Unknown Response"),
    UnknownError("Unknown Error"),
}