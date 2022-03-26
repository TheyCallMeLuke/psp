package com.example.psp.domain.model.member

data class Member(
    val id: Int,
    val name: String,
    val party: String,
    val dateOfBirth: String,
    val imageSrcUrl: String
)