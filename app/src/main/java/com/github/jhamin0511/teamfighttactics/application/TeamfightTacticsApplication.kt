package com.github.jhamin0511.teamfighttactics.application

import android.app.Application
import com.github.jhamin0511.teamfighttactics.BuildConfig
import timber.log.Timber
import timber.log.Timber.DebugTree

class TeamfightTacticsApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    initTimber()
  }

  private fun initTimber() {
    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    }
  }

}
