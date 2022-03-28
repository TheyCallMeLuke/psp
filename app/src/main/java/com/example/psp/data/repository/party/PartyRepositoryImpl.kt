package com.example.psp.data.repository.party

import com.example.psp.data.api.member.entities.MemberVoteResultApiEntity
import com.example.psp.data.api.party.entities.PartyApiEntity
import com.example.psp.data.api.party.entities.PartyVoteStatisticsApiEntity
import com.example.psp.data.api.vote.entities.VoteStatisticsApiEntity
import com.example.psp.domain.model.member.MemberVoteResult
import com.example.psp.domain.model.party.Party
import com.example.psp.domain.model.party.PartyVoteStatistics
import com.example.psp.domain.model.vote.VoteStatistics
import com.example.psp.domain.model.vote.toVoteStatisticTypeEnum
import com.example.psp.domain.repository.PartyRepository
import javax.inject.Inject

class PartyRepositoryImpl @Inject constructor(private val partyRemoteDataSource: PartyRemoteDataSource) :
    PartyRepository {

    override suspend fun getParties(): List<Party> =
        partyRemoteDataSource.getParties().map { partyApiEntity -> partyApiEntity.toDomain() }

    override suspend fun getPartyVoteStatistics(
        partyId: Int,
        voteId: Int
    ): PartyVoteStatistics =
        partyRemoteDataSource.getPartyVoteStatistics(partyId = partyId, voteId = voteId).toDomain()
}

private fun PartyVoteStatisticsApiEntity.toDomain(): PartyVoteStatistics =
    PartyVoteStatistics(
        partyName = this.partyName,
        voteStatistics = this.voteStatistics.toDomain(),
        memberVoteResults = this.memberVoteResults.map { memberVoteResultApiEntity -> memberVoteResultApiEntity.toDomain() }
    )

private fun MemberVoteResultApiEntity.toDomain(): MemberVoteResult =
    MemberVoteResult(
        memberName = this.memberName,
        voteResult = this.voteResult.toVoteStatisticTypeEnum()
    )

private fun VoteStatisticsApiEntity.toDomain(): VoteStatistics =
    VoteStatistics(
        yesCount = this.yesCount,
        noCount = this.noCount,
        loggedOffCount = this.loggedOffCount,
        excusedCount = this.excusedCount,
        abstainedCount = this.abstainedCount,
    )

private fun PartyApiEntity.toDomain(): Party =
    Party(
        id = this.id,
        name = this.name
    )

