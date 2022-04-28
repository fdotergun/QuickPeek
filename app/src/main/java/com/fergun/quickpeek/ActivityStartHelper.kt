package com.fergun.quickpeek

import android.content.Intent

const val MAIN_PACKAGE = "com.fergun.quickpeek"
fun generateMainIntent(activityMap: ActivityMapPackage) : Intent {
    return Intent(Intent.ACTION_VIEW).setClassName(MAIN_PACKAGE, activityMap.className)
}


interface ActivityMapPackage {
    val className: String
}
object ActivityMap {

    object Onboarding : ActivityMapPackage{
        override val className: String
            get() = "com.fergun.onboarding.OnBoardingActivity"
    }


}