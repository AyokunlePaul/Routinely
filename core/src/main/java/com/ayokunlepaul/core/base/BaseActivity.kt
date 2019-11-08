package com.ayokunlepaul.core.base

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.ayokunlepaul.core.R
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity <BINDING: ViewDataBinding, VIEWMODEL: BaseViewModel>  : DaggerAppCompatActivity() {

    abstract val layoutId: Int

    abstract val bindingVariable: Int

    abstract val viewModel: VIEWMODEL

    protected lateinit var binding: BINDING

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.apply {
            lifecycleOwner = this@BaseActivity
            setVariable(bindingVariable, viewModel)
            executePendingBindings()
        }
    }

    fun hideKeyboard() {
        val imm = getSystemService<InputMethodManager>()
        //Find the currently focused view, so we can grab the correct window token from it.
        var view = currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(this)
        }
        imm!!.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun showSnackBar(
        rootView: View,
        text: String,
        isError: Boolean = false,
        duration: Int = Snackbar.LENGTH_SHORT
    ) {
        val snackBar = Snackbar.make(rootView, text, duration)

        if (snackBar.view.layoutParams is FrameLayout.LayoutParams) {
            val param = snackBar.view.layoutParams as FrameLayout.LayoutParams

            val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout
            if (isError) snackBarLayout.setBackgroundColor(Color.RED) else snackBarLayout.setBackgroundColor(
                ContextCompat.getColor(this, R.color.colorPrimary)
            )
            snackBarLayout.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
                .setTextColor(ContextCompat.getColor(rootView.context, android.R.color.white))
            param.gravity = Gravity.TOP
            snackBar.view.layoutParams = param
        }

        snackBar.show()
    }
}