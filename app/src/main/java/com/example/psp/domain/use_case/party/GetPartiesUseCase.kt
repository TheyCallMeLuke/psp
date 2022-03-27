package com.example.psp.domain.use_case.party

import com.example.psp.domain.repository.PartyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class GetPartiesUseCase @Inject constructor(private val partyRepository: PartyRepository) {
    suspend operator fun invoke() = partyRepository.getParties()
}