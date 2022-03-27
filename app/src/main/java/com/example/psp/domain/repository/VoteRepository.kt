package com.example.psp.domain.repository

import com.example.psp.domain.model.vote.Vote
import com.example.psp.domain.model.party.PartyVoteStatistics

interface VoteRepository {
    suspend fun getVotes(): List<Vote>
    suspend fun getVote(): Vote
}