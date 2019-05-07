package com.example.quizkotlin

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.example.quizkotlin.di.appComponent
import io.fabric.sdk.android.Fabric
import org.koin.android.ext.android.startKoin

open class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())
        configureDi()
    }

    // CONFIGURATION ---
    open fun configureDi() =
        startKoin(this, provideComponent())

    // PUBLIC API ---
    open fun provideComponent() = appComponent
}