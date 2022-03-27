package com.example.psp.data.api.party.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PartyApiEntity(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
)