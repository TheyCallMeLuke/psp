package com.example.psp.domain.use_case.member

import com.example.psp.domain.repository.MemberRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class GetMembersUseCase @Inject constructor(private val memberRepository: MemberRepository) {
    suspend operator fun invoke() = memberRepository.getMembers()
}