package com.ayokunlepaul.routinely.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.RecyclerView
import com.ayokunlepaul.core.utils.AutoUpdateRecyclerView
import com.ayokunlepaul.core.utils.TransitionListener
import com.ayokunlepaul.routine.models.RoutineModel
import com.ayokunlepaul.routinely.databinding.LayoutNoRoutineBinding
import com.ayokunlepaul.routinely.databinding.LayoutRoutineBinding
import kotlin.properties.Delegates

class RoutineAdapter constructor(
    context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>(), AutoUpdateRecyclerView {

    var routines: List<RoutineModel> by Delegates.observable(emptyList()) { _, oldRoutines, newRoutines ->
        autoNotify(oldRoutines, newRoutines) { oldRoutine, newRoutine ->
            oldRoutine.routineId == newRoutine.routineId
        }
    }
    private val inflater by lazy { LayoutInflater.from(context) }
    init { setHasStableIds(true) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (routines.isEmpty()) EmptyRoutineViewHolder(LayoutNoRoutineBinding.inflate(
            inflater, parent, false
        )) else RoutineViewHolder(LayoutRoutineBinding.inflate(
            inflater, parent, false
        ))
    }

    override fun getItemCount(): Int = if (routines.isEmpty()) 1 else routines.size

    override fun getItemId(position: Int): Long {
        return if (routines.isEmpty()) 0L else routines[position].hashCode().toLong()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RoutineViewHolder -> {
                holder.setRoutine(routines[position])
            }
            is EmptyRoutineViewHolder -> {
                holder.startAnimation()
            }
        }
    }

    inner class RoutineViewHolder constructor(
        private val binding: LayoutRoutineBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun setRoutine(routineModel: RoutineModel) {
            binding.routine = routineModel
        }
    }

    inner class EmptyRoutineViewHolder constructor(
        private val binding: LayoutNoRoutineBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun startAnimation() {
            (binding.root as MotionLayout).setTransitionListener(object : TransitionListener() {
                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    p0?.transitionToStart()
                }
            })
        }
    }
}