package com.github.jhamin0511.teamfighttactics.data.dto.champion

import com.google.gson.annotations.SerializedName

data class ChampionsDto(
  @SerializedName("version")
  val version: String,
  @SerializedName("items")
  val items: List<ChampionDto>
)
