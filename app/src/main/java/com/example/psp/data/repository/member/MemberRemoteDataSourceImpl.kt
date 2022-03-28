package com.example.psp.data.repository.member

import com.example.psp.data.api.member.MemberApi
import com.example.psp.data.api.member.entities.AgencyApiEntity
import com.example.psp.data.api.member.entities.MemberApiEntity
import com.example.psp.data.api.member.entities.MemberVoteApiEntity
import javax.inject.Inject

class MemberRemoteDataSourceImpl @Inject constructor(private val memberApi: MemberApi) :
    MemberRemoteDataSource {

    override suspend fun getMembers(): List<MemberApiEntity> =
        memberApi.getMembers()

    override suspend fun getMember(memberId: Int): MemberApiEntity =
        memberApi.getMember(memberId)

    override suspend fun getMemberAgencies(memberId: Int): List<AgencyApiEntity> =
        memberApi.getMemberAgencies(memberId)

    override suspend fun getMemberVotes(memberId: Int): List<MemberVoteApiEntity> =
        memberApi.getMemberVotes(memberId)

}