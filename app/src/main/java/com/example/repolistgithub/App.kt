package com.example.repolistgithub

import android.app.Application
import com.example.repolistgithub.data.di.DataModule
import com.example.repolistgithub.domain.DomainModule
import com.example.repolistgithub.presentation.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}