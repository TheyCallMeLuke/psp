package com.example.psp.data.repository.data_source_impl

import com.example.psp.data.api.vote.VoteApi
import com.example.psp.data.api.vote.entities.VoteApiEntity
import com.example.psp.data.repository.data_source.VoteRemoteDataSource
import javax.inject.Inject

class VoteRemoteDataSourceImpl @Inject constructor(private val voteApi: VoteApi) :
    VoteRemoteDataSource {

    override suspend fun getVotes(): List<VoteApiEntity> =
        voteApi.getVotes()

    override suspend fun getVote(voteId: Int): VoteApiEntity =
        voteApi.getVote(voteId)
}

//private fun VoteApiEntity.toDomain() =
//    Vote(
//        id = this.id,
//        description = this.description,
//        date = this.date,
//        meetingNumber = this.meetingNumber,
//        stenoProtocolUrl = this.stenoProtocolUrl,
//        result = when (this.result) {
//            "A" -> VoteResult.Accepted
//            "B" -> VoteResult.Rejected
//            else -> VoteResult.Confusing
//        },
//        statistics = this.voteStatistics,
//        isSaved = false
//    )
