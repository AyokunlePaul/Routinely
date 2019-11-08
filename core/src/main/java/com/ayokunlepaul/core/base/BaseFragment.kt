package com.ayokunlepaul.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerFragment

abstract class BaseFragment <BINDING: ViewDataBinding, VIEWMODEL: BaseViewModel> : DaggerFragment() {

    abstract val layoutId: Int

    abstract val bindingVariable: Int

    abstract val viewModel: VIEWMODEL

    protected lateinit var binding: BINDING

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.apply {
            lifecycleOwner = this@BaseFragment
            setVariable(bindingVariable, viewModel)
            executePendingBindings()
        }

        return binding.root
    }

    fun navigate(direction: NavDirections) = findNavController().navigate(direction)

    fun navigateUp() = findNavController().navigateUp()

    fun showSnackBar(
        rootView: View,
        text: String,
        isError: Boolean = false,
        duration: Int = Snackbar.LENGTH_SHORT
    ) {
        (requireActivity() as BaseActivity<*,*>).showSnackBar(rootView, text, isError, duration)
    }
}