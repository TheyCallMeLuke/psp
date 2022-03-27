package com.example.psp.domain.use_case.vote

import com.example.psp.domain.repository.VoteRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class GetPartyVoteStatistics @Inject constructor(private val voteRepository: VoteRepository) {
    suspend operator fun invoke(partyId: Int) = voteRepository.getPartyVoteStatistics(partyId)
}