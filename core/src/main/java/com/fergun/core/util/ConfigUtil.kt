package com.fergun.core.util

import android.content.Context
import android.os.Build
import java.util.*

fun Context.getUpdatedContextLocale(): Context {
    val locale = Locale.getDefault()
    Locale.setDefault(locale)

    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        updateResources(this, locale)
    } else {
        updateResourcesLegacy(this, locale)
    }
}

private fun updateResources(context: Context, locale: Locale): Context {
    val config = context.resources.configuration
    config.setLocale(locale)
    config.setLayoutDirection(locale)
    return context.createConfigurationContext(config)
}

@Suppress("DEPRECATION")
private fun updateResourcesLegacy(context: Context, locale: Locale): Context {
    val resources = context.resources
    val config = resources.configuration
    config.setLocale(locale)
    config.setLayoutDirection(locale)
    resources.updateConfiguration(config, resources.displayMetrics)
    return context
}