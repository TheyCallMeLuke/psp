package com.example.psp.domain.model.vote

import com.example.psp.R

enum class VoteResult(string: String, icon: Int) {
    Accepted("Přijato", R.drawable.ic_accepted),
    Rejected("Nepřijato", R.drawable.ic_rejected),

    // question mark for icon
    Confusing("Zmatečné", R.drawable.ic_rejected)
}