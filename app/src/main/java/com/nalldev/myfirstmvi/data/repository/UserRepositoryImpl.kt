package com.nalldev.myfirstmvi.data.repository

import android.util.Log
import com.nalldev.myfirstmvi.data.api.ApiService
import com.nalldev.myfirstmvi.data.model.User
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val apiService: ApiService) : UserRepository {
    override suspend fun getUsers(): List<User> {
        try {
            val response = apiService.getUsers()
            Log.e("RESPONSE", response.toString())
            return response
        } catch (e : Exception) {
            return emptyList()
        }
    }
}