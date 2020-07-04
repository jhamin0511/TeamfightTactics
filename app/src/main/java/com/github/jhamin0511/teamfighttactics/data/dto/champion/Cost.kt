package com.github.jhamin0511.teamfighttactics.data.dto.champion

import androidx.annotation.ColorRes
import com.github.jhamin0511.teamfighttactics.R
import com.google.gson.annotations.SerializedName

enum class Cost(
  val value: String,
  @ColorRes
  val color: Int
) {
  @SerializedName("1")
  COMMON("1", R.color.common),

  @SerializedName("2")
  UNCOMMON("2", R.color.uncommon),

  @SerializedName("3")
  RARE("3", R.color.rare),

  @SerializedName("4")
  EPIC("4", R.color.epic),

  @SerializedName("5")
  LEGENDARY("5", R.color.legendary),
}
