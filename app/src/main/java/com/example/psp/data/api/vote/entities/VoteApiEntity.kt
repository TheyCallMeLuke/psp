package com.example.psp.data.api.vote.entities

import com.example.psp.domain.model.vote.VoteStatistics
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VoteApiEntity(
    @Json(name = "id") val id: Int,
    @Json(name = "meeting_number") val meetingNumber: Int,
    @Json(name = "date") val date: String,
    @Json(name = "description") val description: String,
    @Json(name = "steno_protocol_url") val stenoProtocolUrl: String,
    @Json(name = "result") val result: String,
    @Json(name = "vote_statistics") val voteStatistics: VoteStatistics
)