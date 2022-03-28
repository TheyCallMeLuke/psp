package com.example.psp.data.repository.vote

import com.example.psp.data.api.vote.entities.VoteApiEntity
import com.example.psp.domain.model.vote.Vote
import com.example.psp.domain.model.vote.toVoteResultEnum
import com.example.psp.domain.repository.VoteRepository
import javax.inject.Inject

class VoteRepositoryImpl @Inject constructor(private val voteRemoteDataSource: VoteRemoteDataSource) :
    VoteRepository {

    override suspend fun getVotes(): List<Vote> =
        voteRemoteDataSource.getVotes().map { voteApiEntity -> voteApiEntity.toDomain() }

    override suspend fun getVote(voteId: Int): Vote =
        voteRemoteDataSource.getVote(voteId).toDomain()

}

fun VoteApiEntity.toDomain(): Vote =
    Vote(
        id = this.id,
        description = this.description,
        date = this.date,
        meetingNumber = this.meetingNumber,
        stenoProtocolUrl = this.stenoProtocolUrl,
        result = this.result.toVoteResultEnum(),
        statistics = this.statistics,
        isSaved = false, // fix
    )

