package com.example.psp.domain.model.party

import com.example.psp.domain.model.member.MemberVoteResult
import com.example.psp.domain.model.vote.VoteStatistics

data class PartyVoteStatistics(
    val partyName: String,
    val statistics: VoteStatistics,
    val partyMemberVoteStatistics: List<MemberVoteResult>
)