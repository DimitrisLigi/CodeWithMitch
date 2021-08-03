package models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserDomainModel(
    @Expose
    @SerializedName("email")
    val email: String,

    @Expose
    @SerializedName("username")
    val username: String,

    @Expose
    @SerializedName("image")
    val image: String
){
    override fun toString(): String {
        return "User's email: $email\nUser's username: $username\nUser's image: $image\n"
    }
}
