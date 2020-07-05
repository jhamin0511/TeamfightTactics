package com.github.jhamin0511.teamfighttactics.di

import com.github.jhamin0511.teamfighttactics.ui.champion.ChampionsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
  viewModel { ChampionsViewModel(get(), get()) }
}
