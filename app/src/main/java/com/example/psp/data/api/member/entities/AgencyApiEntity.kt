package com.example.psp.data.api.member.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AgencyApiEntity(
    @Json(name = "id") val id: Int,
    @Json(name = "type_id") val typeId: Int,
    @Json(name = "type") val type: String,
    @Json(name = "name") val name: String,
)