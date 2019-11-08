package com.ayokunlepaul.routinely.presentation.fragments

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import com.ayokunlepaul.core.base.BaseFragment
import com.ayokunlepaul.routinely.BR
import com.ayokunlepaul.routinely.R
import com.ayokunlepaul.routinely.databinding.FragmentCreateRoutineBinding
import java.util.*
import javax.inject.Inject

class CreateRoutineFragment : BaseFragment<FragmentCreateRoutineBinding, CreateRoutineFragmentViewModel>() {

    @Inject
    lateinit var createRoutineFragmentViewModel: CreateRoutineFragmentViewModel

    override val layoutId: Int
        get() = R.layout.fragment_create_routine
    override val bindingVariable: Int
        get() = BR.ViewModel
    override val viewModel: CreateRoutineFragmentViewModel
        get() = createRoutineFragmentViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.layout_dropdown_item,
            createRoutineFragmentViewModel.frequencies
        )
        binding.frequency.apply {
            setAdapter(adapter)
        }
        binding.toolbar.setNavigationOnClickListener { navigateUp() }

        createRoutineFragmentViewModel.routineLiveData.observe(this, Observer {
            when (it) {
                null -> {
                    showSnackBar(binding.root, "Routine created!", false)
                    navigateUp()
                }
                else -> showSnackBar(binding.root, it, true)
            }
        })
        binding.createRoutine.setOnClickListener {
            createRoutineFragmentViewModel.createRoutine()
        }
    }
}