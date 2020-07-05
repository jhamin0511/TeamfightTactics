package com.github.jhamin0511.teamfighttactics.di

import com.github.jhamin0511.teamfighttactics.repository.ConfigRepository
import org.koin.dsl.module

val repositoryModule = module {
  single { ConfigRepository() }
}
