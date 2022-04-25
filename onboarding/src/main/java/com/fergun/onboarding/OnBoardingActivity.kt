package com.fergun.onboarding

import androidx.activity.viewModels
import com.fergun.core.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnBoardingActivity: BaseActivity() {

    val onBoardingViewModel: OnBoardingViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_onboarding


}