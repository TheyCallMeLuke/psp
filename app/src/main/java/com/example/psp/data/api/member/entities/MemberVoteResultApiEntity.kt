package com.example.psp.data.api.member.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MemberVoteResultApiEntity(
    @Json(name = "member_name") val memberName: String,
    @Json(name = "vote_result") val voteResult: String,
)
