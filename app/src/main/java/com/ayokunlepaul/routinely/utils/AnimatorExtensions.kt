package com.ayokunlepaul.routinely.utils

import androidx.recyclerview.widget.RecyclerView
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator

fun RecyclerView.setAnimator() {
    itemAnimator = SlideInUpAnimator().apply {
        moveDuration = 1000
        changeDuration = 1000
        removeDuration = 1000
        addDuration = 1000
    }
}