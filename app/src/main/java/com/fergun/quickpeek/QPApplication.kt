package com.fergun.quickpeek

import android.app.Application
import android.content.Context
import android.os.Build
import dagger.hilt.android.HiltAndroidApp
import java.util.*

@HiltAndroidApp
class QPApplication: Application() {

}


fun Context.updateContextResources(): Context {
    val locale = Locale.getDefault()

    val resources = resources
    val configuration = resources.configuration
    configuration.setLocale(locale)

    configuration.setLayoutDirection(locale)

    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        createConfigurationContext(configuration)
    } else {
        @Suppress("DEPRECATION")
        resources.updateConfiguration(configuration, resources.displayMetrics)
        this
    }
}