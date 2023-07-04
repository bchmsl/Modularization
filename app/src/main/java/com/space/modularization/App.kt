package com.space.modularization

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(module)
            androidContext(this@App)
        }
    }
}