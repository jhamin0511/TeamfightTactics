package com.github.jhamin0511.teamfighttactics.application

import android.app.Application
import com.github.jhamin0511.teamfighttactics.BuildConfig
import com.github.jhamin0511.teamfighttactics.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import timber.log.Timber
import timber.log.Timber.DebugTree

class TeamfightTacticsApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    initKoin()
    initTimber()
  }

  private fun initKoin() {
    val modules: List<Module> = listOf(
      appModule
    )

    startKoin {
      androidContext(this@TeamfightTacticsApplication)
      androidLogger()
      modules(modules)
    }
  }

  private fun initTimber() {
    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    }
  }

}
