package com.example.psp.data.repository.party

import com.example.psp.data.api.party.PartyApi
import com.example.psp.data.api.party.entities.PartyApiEntity
import com.example.psp.data.api.party.entities.PartyVoteStatisticsApiEntity
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
