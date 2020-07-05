package com.github.jhamin0511.teamfighttactics.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.github.jhamin0511.teamfighttactics.repository.ConfigRepository

class ApplicationLifecycleObserver(
  private val configRepository: ConfigRepository
) : LifecycleObserver {

  @OnLifecycleEvent(Lifecycle.Event.ON_START)
  fun onForeground() {
    configRepository.fetch()
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
  fun onBackground() {
  }

}
