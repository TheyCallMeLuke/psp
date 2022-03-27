package com.example.psp.data.api.party.entities

import com.example.psp.data.api.member.entities.PartyMemberVoteApiEntity
import com.example.psp.data.api.vote.entities.VoteStatisticsApiEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PartyVoteStatisticsApiEntity(
    @Json(name = "party_name") val partyName: String,
    @Json(name = "vote_statistics") val voteStatistics: VoteStatisticsApiEntity,
    @Json(name = "member_votes") val partyMemberVotes: List<PartyMemberVoteApiEntity>
)