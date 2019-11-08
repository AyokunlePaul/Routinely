package com.ayokunlepaul.core.utils

import androidx.constraintlayout.motion.widget.MotionLayout

abstract class TransitionListener : MotionLayout.TransitionListener {

    override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}

    override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}

    override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {}
}