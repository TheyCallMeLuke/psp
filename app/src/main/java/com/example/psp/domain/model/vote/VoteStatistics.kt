package com.example.psp.domain.model.vote

data class VoteStatistics(
    val yesCount: Int,
    val noCount: Int,
    val loggedOffCount: Int,
    val excusedCount: Int,
    val abstainedCount: Int
)
