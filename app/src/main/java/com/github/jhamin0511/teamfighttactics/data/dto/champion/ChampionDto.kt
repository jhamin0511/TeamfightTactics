package com.github.jhamin0511.teamfighttactics.data.dto.champion

import com.google.gson.annotations.SerializedName

data class ChampionDto(
  @SerializedName("name")
  val champion: Champion,
  @SerializedName("championId")
  val id: String,
  @SerializedName("cost")
  val cost: Cost,
  @SerializedName("traits")
  val traits: List<Trait>
)
