package com.fergun.core

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class DummyInjection {

    @Provides
    fun provideDummyInstance(): DummyInjection {
        return DummyInjection()
    }
}