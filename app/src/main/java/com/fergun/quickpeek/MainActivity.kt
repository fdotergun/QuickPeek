package com.fergun.quickpeek

class MainActivity : com.fergun.core.ui.BaseActivity() {

    override val layoutId = R.layout.activity_main

    override fun onResume() {
        super.onResume()
        val intent = generateMainIntent(ActivityMap.Onboarding)
        startActivity(intent)
        finish()
    }
}