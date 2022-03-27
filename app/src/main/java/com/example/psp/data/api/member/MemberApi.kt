package com.example.psp.data.api.member

import com.example.psp.data.api.member.entities.AgencyApiEntity
import com.example.psp.data.api.member.entities.MemberApiEntity
import com.example.psp.data.api.member.entities.MemberVoteApiEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val DEFAULT_PAGE_NUMBER = 0
private const val DEFAULT_PAGE_size = 20
private const val DEFAULT_SORT_METHOD = "id"
private const val DEFAULT_RESULT_ORDER = "desc"

interface MemberApi {

    @GET("api/member")
    suspend fun getMembers(
        @Query("page") page: Int = DEFAULT_PAGE_NUMBER,
        @Query("size") size: Int = DEFAULT_PAGE_size,
        @Query("sortBy") sortBy: String = DEFAULT_SORT_METHOD,
        @Query("order") order: String = DEFAULT_RESULT_ORDER
    ): List<MemberApiEntity>

    @GET("api/member/{id}")
    suspend fun getMember(
        @Path("id") id: Int
    ): MemberApiEntity

    @GET("api/member/{id}/agency")
    suspend fun getMemberAgencies(
        @Path("id") id: Int
    ): List<AgencyApiEntity>

    @GET("api/member/{id}/vote")
    suspend fun getMemberVotes(
        @Path("id") id: Int
    ): List<MemberVoteApiEntity>
}