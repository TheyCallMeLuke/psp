package com.example.psp.data.api.member.entities

import com.example.psp.data.api.vote.entities.VoteApiEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class MemberVoteApiEntity(
    @Json(name = "vote") val vote: VoteApiEntity,
    @Json(name = "result") val result: String
)
