package com.fergun.onboarding

import androidx.lifecycle.MutableLiveData
import com.fergun.core.DummyInjection
import com.fergun.core.ui.BaseViewModel
import com.fergun.onboarding.model.SignUpModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(val dummyInjection: DummyInjection): BaseViewModel(){

    private val _signUpModel = MutableLiveData<SignUpModel>()
    val signUpModel = _signUpModel


}