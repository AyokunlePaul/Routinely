package com.ayokunlepaul.routinely.presentation

import android.os.Bundle
import com.ayokunlepaul.core.base.BaseActivity
import com.ayokunlepaul.routinely.R
import com.ayokunlepaul.routinely.databinding.ActivityMainBinding
import com.ayokunlepaul.routinely.di.DaggerRoutinelyApplicationComponent
import javax.inject.Inject

class MainActivity : BaseActivity <ActivityMainBinding, MainActivityViewModel>() {

    @Inject
    lateinit var mainActivityViewModel: MainActivityViewModel

    override val layoutId: Int
        get() = R.layout.activity_main
    override val bindingVariable: Int
        get() = 0
    override val viewModel: MainActivityViewModel
        get() = mainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}