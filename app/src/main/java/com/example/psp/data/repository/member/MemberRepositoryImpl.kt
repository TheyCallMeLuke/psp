package com.example.psp.data.repository.member

import com.example.psp.data.api.member.entities.AgencyApiEntity
import com.example.psp.data.api.member.entities.MemberApiEntity
import com.example.psp.data.api.member.entities.MemberVoteApiEntity
import com.example.psp.data.repository.vote.toDomain
import com.example.psp.domain.model.member.Agency
import com.example.psp.domain.model.member.Member
import com.example.psp.domain.model.member.MemberVote
import com.example.psp.domain.model.vote.toVoteStatisticTypeEnum
import com.example.psp.domain.repository.MemberRepository
import javax.inject.Inject

class MemberRepositoryImpl @Inject constructor(private val memberRemoteDataSource: MemberRemoteDataSource) :
    MemberRepository {

    override suspend fun getMembers(): List<Member> {
        TODO("Not yet implemented")
    }

    override suspend fun getMember(memberId: Int): Member =
        memberRemoteDataSource.getMember(memberId).toDomain()

    override suspend fun getMemberAgencies(memberId: Int): List<Agency> =
        memberRemoteDataSource.getMemberAgencies(memberId)
            .map { agencyApiEntity -> agencyApiEntity.toDomain() }

    override suspend fun getMemberVotes(memberId: Int): List<MemberVote> =
        memberRemoteDataSource.getMemberVotes(memberId)
            .map { memberVoteApiEntity -> memberVoteApiEntity.toDomain() }
}

fun MemberVoteApiEntity.toDomain(): MemberVote =
    MemberVote(
        vote = this.vote.toDomain(),
        result = this.result.toVoteStatisticTypeEnum()
    )

fun AgencyApiEntity.toDomain(): Agency =
    Agency(
        id = this.id,
        typeId = this.typeId,
        type = this.type,
        name = this.name
    )


fun MemberApiEntity.toDomain(): Member =
    Member(
        id = this.id,
        name = this.name,
        party = this.party,
        dateOfBirth = this.dateOfBirth,
        imageSrcUrl = this.photoUrl
    )
