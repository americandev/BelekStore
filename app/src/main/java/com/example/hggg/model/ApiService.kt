package com.example.hggg.model

import com.example.hggg.dataClasss.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {

    @GET("ads")
    suspend fun getAdds(
        @Query("login") login: String, @Query("token") token: String,
        @Query("category_id") categoryId: Int
    ): Ads


    @GET("auto/categories/{categoryId}/bodystyles")
    suspend fun bodyTypes(
        @Path("categoryId") categoryId: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>

    @GET("auto/categories/")
    suspend fun typesOfTransport(@Query("api_key") apiKey: String): List<SimpleDataModel>

    @GET("auto/categories/{categoryId}/marks")
    suspend fun stamps(
        @Path("categoryId") categoryId: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>

    @GET("categories/{categoryId}/marks/{markId}/models")
    suspend fun models(
        @Path("categoryId") categoryId: String,
        @Path("markId") markId: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>


    @GET("auto/states")
    suspend fun areas(@Query("api_key") apiKey: String): List<SimpleDataModel>

    @GET("auto/states/{stateId}/cities")
    suspend fun cities(
        @Path("stateId") stateId: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>


    @GET("auto/categories/{categoryId}/driverTypes")
    suspend fun driverTypes(
        @Path("categoryId") category: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>

    @GET("auto/type")
    suspend fun type(@Query("api_key") apiKey: String): List<SimpleDataModel>

    @GET("auto/categories/{categoryId}/gearboxes")
    suspend fun gearboxes(
        @Path("categoryId") categoryId: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>

    @GET("auto/categories/{categoryId}/options")
    suspend fun options(
        @Path("categoryId") categoryId: String,
        @Query("api_key") apiKey: String
    ): List<SimpleDataModel>

    @GET("auto/colors")
    suspend fun colors(@Query("api_key") apiKey: String): List<SimpleDataModel>

    @GET("auto/countries")
    suspend fun countries(@Query("api_key") apiKey: String): List<SimpleDataModel>


}