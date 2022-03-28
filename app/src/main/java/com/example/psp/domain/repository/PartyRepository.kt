package com.example.psp.domain.repository

import com.example.psp.domain.model.party.Party
import com.example.psp.domain.model.party.PartyVoteStatistics

interface PartyRepository {
    suspend fun getParties(): List<Party>
    suspend fun getPartyVoteStatistics(partyId: Int, voteId: Int): PartyVoteStatistics
}