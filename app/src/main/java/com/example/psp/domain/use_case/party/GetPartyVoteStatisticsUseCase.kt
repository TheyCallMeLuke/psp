package com.example.psp.domain.use_case.party

import com.example.psp.domain.repository.PartyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class GetPartyVoteStatisticsUseCase @Inject constructor(private val partyRepository: PartyRepository) {
    suspend operator fun invoke(partyId: Int, voteId: Int) =
        partyRepository.getPartyVoteStatistics(partyId, voteId)
}