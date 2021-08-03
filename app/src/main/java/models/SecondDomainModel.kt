package models


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SecondDomainModel(
    @Expose
    @SerializedName("data")
    val data: Data,

    @Expose
    @SerializedName("support")
    val support: Support
)