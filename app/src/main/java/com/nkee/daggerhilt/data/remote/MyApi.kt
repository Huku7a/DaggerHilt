package com.nkee.daggerhilt.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("test")
    suspend fun doNetCall()
}