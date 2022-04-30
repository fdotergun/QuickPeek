package com.fergun.onboarding

import androidx.activity.viewModels
import com.fergun.core.ui.BaseActivity

class OnBoardingActivity: BaseActivity() {

    val onBoardingViewModel: OnBoardingViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_onboarding

}