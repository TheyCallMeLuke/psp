package com.example.psp.domain.model.member

import com.example.psp.domain.model.vote.VoteStatisticType

data class MemberVoteResult(
    val voteId: Int,
    val result: VoteStatisticType
)