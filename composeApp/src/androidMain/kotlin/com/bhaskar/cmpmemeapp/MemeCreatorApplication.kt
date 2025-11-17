package com.bhaskar.cmpmemeapp

import android.app.Application
import com.bhaskar.cmpmemeapp.di.initKoin
import org.koin.android.ext.koin.androidContext

class MemeCreatorApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MemeCreatorApplication)
        }
    }

}