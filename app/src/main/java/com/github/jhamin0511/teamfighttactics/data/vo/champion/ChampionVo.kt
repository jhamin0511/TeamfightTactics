package com.github.jhamin0511.teamfighttactics.data.vo.champion

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class ChampionVo(
  @DrawableRes
  val image: Int,
  @StringRes
  val name: Int,
  @ColorRes
  val color: Int,
  val cost: Int,
  @DrawableRes
  val traits: List<Int>
)
