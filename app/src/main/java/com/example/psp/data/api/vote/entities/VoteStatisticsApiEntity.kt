package com.example.psp.data.api.vote.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class VoteStatisticsApiEntity(
    @Json(name = "yes_count") val yesCount: Int,
    @Json(name = "no_count") val noCount: Int,
    @Json(name = "logged_off_count") val loggedOffCount: Int,
    @Json(name = "excused_count") val excusedCount: Int,
    @Json(name = "abstained_count") val abstainedCount: Int,
)