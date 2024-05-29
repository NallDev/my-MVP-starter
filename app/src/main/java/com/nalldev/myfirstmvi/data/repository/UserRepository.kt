package com.nalldev.myfirstmvi.data.repository

import com.nalldev.myfirstmvi.data.model.User

interface UserRepository {
    suspend fun getUsers() : List<User>
}