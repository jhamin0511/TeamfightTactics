package com.github.jhamin0511.teamfighttactics.repository

import com.github.jhamin0511.teamfighttactics.data.dto.champion.ChampionsDto
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.get
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.google.gson.Gson
import java.util.concurrent.TimeUnit

class ConfigRepository {

  private val config = Firebase.remoteConfig
  private val setting = remoteConfigSettings {
    minimumFetchIntervalInSeconds = TimeUnit.MINUTES.toMinutes(15)
  }

  init {
    config.setConfigSettingsAsync(setting)
  }

  fun fetch() {
    config.fetchAndActivate()
      .addOnCompleteListener {}
      .addOnFailureListener {}
  }

  fun getChampions(): ChampionsDto {
    val json = config["champions"].asString()

    return if (json.isEmpty()) {
      ChampionsDto()
    } else {
      Gson().fromJson(json, ChampionsDto::class.java)
    }
  }

}
