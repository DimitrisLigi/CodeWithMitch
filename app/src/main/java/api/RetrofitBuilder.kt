package api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {
    private const val BASE_URL = "https://open-api.xyz/"

    private const val SECOND_URL = "https://reqres.in"

    private val retrofitBuilder : Retrofit.Builder by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    private val secondRetrofitBuilder: Retrofit.Builder by lazy{
        Retrofit.Builder()
            .baseUrl(SECOND_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiService: ApiService by lazy {
        retrofitBuilder.build().create(ApiService::class.java)
        secondRetrofitBuilder.build().create(ApiService::class.java)
    }





}