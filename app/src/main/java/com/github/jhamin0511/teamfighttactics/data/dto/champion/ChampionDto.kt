package com.github.jhamin0511.teamfighttactics.data.dto.champion

import com.google.gson.annotations.SerializedName

data class ChampionDto(
  @SerializedName("")
  val name: String,
  @SerializedName("championId")
  val id: String,
  @SerializedName("cost")
  val cost: Int,
  @SerializedName("traits")
  val traits: List<TraitType>
)
