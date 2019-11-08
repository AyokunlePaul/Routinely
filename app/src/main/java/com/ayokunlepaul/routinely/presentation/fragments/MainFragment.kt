package com.ayokunlepaul.routinely.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayokunlepaul.core.base.BaseFragment
import com.ayokunlepaul.core.utils.LinearLayoutManagerWrapper
import com.ayokunlepaul.routinely.BR
import com.ayokunlepaul.routinely.R
import com.ayokunlepaul.routinely.adapters.RoutineAdapter
import com.ayokunlepaul.routinely.databinding.FragmentMainBinding
import com.ayokunlepaul.routinely.utils.setAnimator
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper
import javax.inject.Inject

class MainFragment : BaseFragment<FragmentMainBinding, MainFragmentViewModel>() {

    @Inject
    lateinit var mainFragmentViewModel: MainFragmentViewModel

    private val routinesAdapter by lazy { RoutineAdapter(requireContext()) }

    override val layoutId: Int
        get() = R.layout.fragment_main
    override val bindingVariable: Int
        get() = BR.ViewModel
    override val viewModel: MainFragmentViewModel
        get() = mainFragmentViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.newRoutine.setOnClickListener {
            val direction = MainFragmentDirections.actionFragmentMainToFragmentCreateRoutine()
            navigate(direction)
        }
        binding.toolbar.apply {
            inflateMenu(R.menu.main_fragment_menu)
            setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.menu_next_up -> {
                        true
                    }
                    else -> false
                }
            }
            setNavigationOnClickListener { navigateUp() }
        }
        binding.routines.apply {
            setAnimator()
            adapter = routinesAdapter
            layoutManager = LinearLayoutManagerWrapper(requireContext())
            OverScrollDecoratorHelper.setUpOverScroll(this, OverScrollDecoratorHelper.ORIENTATION_VERTICAL)
        }
        mainFragmentViewModel.routines.observe(this, Observer {
            routinesAdapter.routines = it
        })
        mainFragmentViewModel.getRoutines()
    }
}