package models


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Support(
    @Expose
    @SerializedName("text")
    val text: String,

    @Expose
    @SerializedName("url")
    val url: String
)