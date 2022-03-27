package com.example.psp.domain.repository

import com.example.psp.domain.model.member.Agency
import com.example.psp.domain.model.member.MemberVote
import java.lang.reflect.Member

interface MemberRepository {
    suspend fun getMembers(): List<Member>
    suspend fun getMember(memberId: Int): Member
    suspend fun getMemberAgencies(memberId: Int): List<Agency>
    suspend fun getMemberVotes(memberId: Int): List<MemberVote>
}