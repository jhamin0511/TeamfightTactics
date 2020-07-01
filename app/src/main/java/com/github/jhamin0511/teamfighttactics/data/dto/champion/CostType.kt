package com.github.jhamin0511.teamfighttactics.data.dto.champion

import com.google.gson.annotations.SerializedName

enum class CostType(
  val cost: Int
) {
  @SerializedName("1")
  COMMON(1),

  @SerializedName("2")
  UNCOMMON(2),

  @SerializedName("3")
  RARE(3),

  @SerializedName("4")
  EPIC(4),

  @SerializedName("5")
  LEGENDARY(5),
}
