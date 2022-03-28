package com.example.psp.data.api.member.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MemberApiEntity(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "party") val party: String,
    @Json(name = "date_of_birth") val dateOfBirth: String,
    @Json(name = "photo_url") val photoUrl: String,
)