package com.example.psp.data.repository.vote

import com.example.psp.data.api.vote.entities.VoteApiEntity

interface VoteRemoteDataSource {
    suspend fun getVotes(): List<VoteApiEntity>
    suspend fun getVote(id: Int): VoteApiEntity
}