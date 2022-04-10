package com.fergun.onboarding

import com.fergun.core.DummyInjection
import com.fergun.core.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(val dummyInjection: DummyInjection): BaseViewModel(){
}