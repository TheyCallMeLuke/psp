package com.example.psp.data.api.member.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MemberAgenciesApiEntity(
    @Json(name = "member_id") val id: Int,
    @Json(name = "agencies") val agencies: List<AgencyApiEntity>,
)