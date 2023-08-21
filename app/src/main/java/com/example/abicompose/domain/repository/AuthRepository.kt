package com.example.abicompose.domain.repository

import com.example.abicompose.data.Resource
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    val currentUser:FirebaseUser?

    suspend fun login(email: String, password:String):Boolean

    suspend fun register(email:String, password: String):Boolean

    suspend fun loginFirebase(email: String, password:String):Resource<FirebaseUser>
    suspend fun registerFirebase(name:String,dni:String,telefono:String,condicion:String,edad:String, email:String, password: String):Resource<FirebaseUser>


    fun logout()

}