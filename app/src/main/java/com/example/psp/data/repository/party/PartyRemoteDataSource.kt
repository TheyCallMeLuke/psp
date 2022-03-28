package com.example.psp.data.repository.party

import com.example.psp.data.api.party.entities.PartyApiEntity
import com.example.psp.data.api.party.entities.PartyVoteStatisticsApiEntity
import com.example.psp.domain.model.party.Party
import com.example.psp.domain.model.party.PartyVoteStatistics
import java.lang.reflect.Member

interface PartyRemoteDataSource {
    suspend fun getParties(): List<PartyApiEntity>
    suspend fun getPartyVoteStatistics(partyId: Int, voteId: Int): PartyVoteStatisticsApiEntity
}