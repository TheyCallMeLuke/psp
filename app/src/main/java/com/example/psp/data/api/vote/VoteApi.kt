package com.example.psp.data.api.vote

import com.example.psp.data.api.vote.entities.VoteApiEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val DEFAULT_PAGE_NUMBER = 0
private const val DEFAULT_PAGE_size = 20
private const val DEFAULT_SORT_METHOD = "id"
private const val DEFAULT_RESULT_ORDER = "desc"

interface VoteApi {

    @GET("api/vote")
    suspend fun getVotes(
        @Query("page") page: Int = DEFAULT_PAGE_NUMBER,
        @Query("size") size: Int = DEFAULT_PAGE_size,
        @Query("sortBy") sortBy: String = DEFAULT_SORT_METHOD,
        @Query("order") order: String = DEFAULT_RESULT_ORDER
    ): List<VoteApiEntity>

    @GET("api/vote/{id}")
    suspend fun getVote(
        @Path("id") id: Int,
        @Query("page") page: Int = DEFAULT_PAGE_NUMBER,
        @Query("size") size: Int = DEFAULT_PAGE_size,
        @Query("sortBy") sortBy: String = DEFAULT_SORT_METHOD,
        @Query("order") order: String = DEFAULT_RESULT_ORDER
    ): VoteApiEntity

}