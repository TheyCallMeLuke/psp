package com.example.psp.data.repository.data_source

import com.example.psp.data.api.member.MemberApi
import com.example.psp.data.api.member.entities.AgencyApiEntity
import com.example.psp.data.api.member.entities.MemberApiEntity
import com.example.psp.data.api.member.entities.MemberVoteApiEntity
import com.example.psp.domain.model.member.Agency
import java.lang.reflect.Member

interface MemberRemoteDataSource {
    suspend fun getMembers(): List<MemberApiEntity>
    suspend fun getMember(memberId: Int): MemberApiEntity
    suspend fun getMemberAgencies(memberId: Int): List<AgencyApiEntity>
    suspend fun getMemberVotes(memberId: Int): List<MemberVoteApiEntity>
}