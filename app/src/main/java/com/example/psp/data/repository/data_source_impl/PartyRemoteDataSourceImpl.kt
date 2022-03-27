package com.example.psp.data.repository.data_source_impl

import com.example.psp.data.api.party.PartyApi
import com.example.psp.data.api.party.entities.PartyApiEntity
import com.example.psp.data.api.party.entities.PartyVoteStatisticsApiEntity
import com.example.psp.data.api.vote.VoteApi
import com.example.psp.data.api.vote.entities.VoteApiEntity
import com.example.psp.data.repository.data_source.PartyRemoteDataSource
import com.example.psp.data.repository.data_source.VoteRemoteDataSource
import com.example.psp.domain.model.party.Party
import com.example.psp.domain.model.party.PartyVoteStatistics
import javax.inject.Inject

class PartyRemoteDataSourceImpl @Inject constructor(private val partyApi: PartyApi) :
    PartyRemoteDataSource {

    override suspend fun getParties(): List<PartyApiEntity> =
        partyApi.getParties()

    override suspend fun getPartyVoteStatistics(
        partyId: Int,
        voteId: Int
    ): PartyVoteStatisticsApiEntity =
        partyApi.getPartyVoteStatistics(
            partyId = partyId,
            voteId = voteId
        )

}
