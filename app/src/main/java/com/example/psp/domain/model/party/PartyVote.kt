package com.example.psp.domain.model.party

import com.example.psp.domain.model.vote.VoteStatistic

data class PartyVote(
    val partyName: String,
    val partyBrandUrl: String,
    val statistics: List<VoteStatistic>
)