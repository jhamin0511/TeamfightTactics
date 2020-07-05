package com.github.jhamin0511.teamfighttactics.di

import com.github.jhamin0511.teamfighttactics.lifecycle.ApplicationLifecycleObserver
import org.koin.dsl.module

val lifecycleModule = module {
  single { ApplicationLifecycleObserver(get()) }
}
