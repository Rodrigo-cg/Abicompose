package com.example.abicompose.data
import com.example.abicompose.domain.repository.AuthRepository
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.delay

class AuthRepositoryImpl : AuthRepository {
    override val currentUser: FirebaseUser?
        get() = TODO("Not yet implemented")

    override suspend fun login(email: String, password: String): Boolean {
        delay(1000)
        return true
    }

    override suspend fun register(email: String, password: String): Boolean {
        delay(1000)
        return true
    }

    override suspend fun loginFirebase(email: String, password: String): Resource<FirebaseUser> {
        TODO("Not yet implemented")
    }

    override suspend fun registerFirebase(
        name: String,
        dni: String,
        telefono: String,
        condicion: String,
        edad: String,
        email: String,
        password: String
    ): Resource<FirebaseUser> {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

}