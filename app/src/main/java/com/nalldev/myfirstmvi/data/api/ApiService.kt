package com.nalldev.myfirstmvi.data.api

import com.nalldev.myfirstmvi.data.model.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers() : List<User>
}