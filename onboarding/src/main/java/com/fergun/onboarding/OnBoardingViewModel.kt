package com.fergun.onboarding

import androidx.lifecycle.MutableLiveData
import com.fergun.core.ui.BaseViewModel
import com.fergun.onboarding.di.DummyInjectionModule
import com.fergun.onboarding.model.SignUpModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(val dummyInjectionFetcher: DummyInjectionModule): BaseViewModel(){

    private val _signUpModel = MutableLiveData<SignUpModel>()
    val signUpModel = _signUpModel


}