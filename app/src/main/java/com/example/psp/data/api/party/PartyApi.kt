package com.example.psp.data.api.party

import com.example.psp.data.api.party.entities.PartyApiEntity
import com.example.psp.data.api.party.entities.PartyVoteStatisticsApiEntity
import retrofit2.http.GET
import retrofit2.http.Path

private const val DEFAULT_PAGE_NUMBER = 0
private const val DEFAULT_PAGE_size = 20
private const val DEFAULT_SORT_METHOD = "id"
private const val DEFAULT_RESULT_ORDER = "desc"

interface VoteApi {

    @GET("api/party")
    suspend fun getParties(): List<PartyApiEntity>

    @GET("api/party/{partyId}/vote/{voteId}")
    suspend fun getPartyVoteStatistics(
        @Path("partyId") partyId: Int,
        @Path("voteId") voteId: Int,
    ): PartyVoteStatisticsApiEntity

}