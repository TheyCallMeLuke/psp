package com.example.psp.data.repository.vote

import com.example.psp.data.api.vote.VoteApi
import com.example.psp.data.api.vote.entities.VoteApiEntity
import javax.inject.Inject

class VoteRemoteDataSourceImpl @Inject constructor(private val voteApi: VoteApi) :
    VoteRemoteDataSource {

    override suspend fun getVotes(): List<VoteApiEntity> =
        voteApi.getVotes()

    override suspend fun getVote(voteId: Int): VoteApiEntity =
        voteApi.getVote(voteId)
}
