package api

import models.UserDomainModel
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("placeholder/user/{userID}")
    suspend fun getUser(@Path("userID") userID: String): UserDomainModel
}