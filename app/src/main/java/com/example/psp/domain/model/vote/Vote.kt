package com.example.psp.domain.model.vote

data class Vote(
    val id: Int,
    val description: String,
    val date: String,
    val meetingNumber: Int,
    val stenoProtocolUrl: String,
    val result: VoteResult,
    val statistics: VoteStatistics,
    val isSaved: Boolean,
)