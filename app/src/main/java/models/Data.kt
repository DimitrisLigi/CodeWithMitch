package models


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(

    @Expose
    @SerializedName("avatar")
    val avatar: String,

    @Expose
    @SerializedName("email")
    val email: String,

    @Expose
    @SerializedName("first_name")
    val firstName: String,

    @Expose
    @SerializedName("id")
    val id: Int,

    @Expose
    @SerializedName("last_name")
    val lastName: String
)