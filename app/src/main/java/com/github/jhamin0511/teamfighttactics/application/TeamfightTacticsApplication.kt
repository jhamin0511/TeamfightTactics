package com.github.jhamin0511.teamfighttactics.application

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import com.github.jhamin0511.teamfighttactics.BuildConfig
import com.github.jhamin0511.teamfighttactics.di.appModule
import com.github.jhamin0511.teamfighttactics.di.lifecycleModule
import com.github.jhamin0511.teamfighttactics.di.repositoryModule
import com.github.jhamin0511.teamfighttactics.di.viewModelModule
import com.github.jhamin0511.teamfighttactics.lifecycle.ApplicationLifecycleObserver
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import timber.log.Timber
import timber.log.Timber.DebugTree

class TeamfightTacticsApplication : Application() {

  private val appLifecycleObserve: ApplicationLifecycleObserver by inject()

  override fun onCreate() {
    super.onCreate()

    initKoin()
    initTimber()
    ProcessLifecycleOwner.get().lifecycle.addObserver(appLifecycleObserve)
  }

  private fun initKoin() {
    val modules: List<Module> = listOf(
      appModule,
      lifecycleModule,
      viewModelModule,
      repositoryModule
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
