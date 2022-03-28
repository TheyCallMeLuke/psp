package com.example.psp.data.repository.member

import com.example.psp.data.api.member.entities.AgencyApiEntity
import com.example.psp.data.api.member.entities.MemberApiEntity
import com.example.psp.data.api.member.entities.MemberVoteApiEntity

interface MemberRemoteDataSource {
    suspend fun getMembers(): List<MemberApiEntity>
    suspend fun getMember(memberId: Int): MemberApiEntity
    suspend fun getMemberAgencies(memberId: Int): List<AgencyApiEntity>
    suspend fun getMemberVotes(memberId: Int): List<MemberVoteApiEntity>
}