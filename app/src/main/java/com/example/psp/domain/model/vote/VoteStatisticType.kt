package com.example.psp.domain.model.vote

import com.example.psp.R

enum class VoteStatisticType(val string: Int, val icon: Int) {
    Yes(R.string.vote_statistic_type_yes, R.drawable.ic_yes),
    No(R.string.vote_statistic_type_no, R.drawable.ic_no),
    LoggedOff(R.string.vote_statistic_type_logged_off, R.drawable.ic_logged_off),
    Excused(R.string.vote_statistic_type_excused, R.drawable.ic_excused),
    Abstained(R.string.vote_statistic_type_abstained, R.drawable.ic_abstained),
}

fun String.toVoteStatisticTypeEnum(): VoteStatisticType =
    when (this) {
        "A" -> VoteStatisticType.Yes
        "B" -> VoteStatisticType.No
        "K" -> VoteStatisticType.Abstained
        "@" -> VoteStatisticType.LoggedOff
        else -> VoteStatisticType.Excused
    }