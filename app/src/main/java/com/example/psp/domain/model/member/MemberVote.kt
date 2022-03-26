package com.example.psp.domain.model.member

import com.example.psp.domain.model.vote.Vote
import com.example.psp.domain.model.vote.VoteStatisticType

data class MemberVote(
    val vote: Vote,
    val howDidTheMemberVote: VoteStatisticType
)