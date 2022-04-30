package com.fergun.onboarding.signup

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.fergun.core.ui.BaseFragment
import com.fergun.onboarding.OnBoardingViewModel
import com.fergun.onboarding.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignupFragment : BaseFragment() {

    val viewModel: OnBoardingViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSignUpBinding.inflate(inflater, container, false)

        viewModel.signUpModel.observe(this) {
            Log.d("SignUpFragment", "$it")
        }
        return binding.root
    }
}