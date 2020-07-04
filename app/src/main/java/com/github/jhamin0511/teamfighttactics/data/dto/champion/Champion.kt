package com.github.jhamin0511.teamfighttactics.data.dto.champion

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.github.jhamin0511.teamfighttactics.R
import com.google.gson.annotations.SerializedName

enum class Champion(
  @DrawableRes
  val imageRes: Int,
  @StringRes
  val nameRes: Int
) {
  @SerializedName("Ahri")
  AHRI(R.drawable.champion_ahri, R.string.champion_ahri),

  @SerializedName("Annie")
  ANNIE(R.drawable.champion_annie, R.string.champion_annie),

  @SerializedName("Ashe")
  ASHE(R.drawable.champion_ashe, R.string.champion_ashe),

  @SerializedName("Aurelion Sol")
  AURELION_SOL(R.drawable.champion_aurelionsol, R.string.champion_aurelionsol),

  @SerializedName("Bard")
  BARD(R.drawable.champion_bard, R.string.champion_bard),

  @SerializedName("Blitzcrank")
  BLITZCRANK(R.drawable.champion_blitzcrank, R.string.champion_blitzcrank),

  @SerializedName("Caitlyn")
  CAITLYN(R.drawable.champion_caitlyn, R.string.champion_caitlyn),

  @SerializedName("Cassiopeia")
  CASSIOPEIA(R.drawable.champion_cassiopeia, R.string.champion_cassiopeia),

  @SerializedName("Darius")
  DARIUS(R.drawable.champion_darius, R.string.champion_darius),

  @SerializedName("Ekko")
  EKKO(R.drawable.champion_ekko, R.string.champion_ekko),

  @SerializedName("Ezreal")
  EZREAL(R.drawable.champion_ezreal, R.string.champion_ezreal),

  @SerializedName("Fiora")
  FIORA(R.drawable.champion_fiora, R.string.champion_fiora),

  @SerializedName("Fizz")
  FIZZ(R.drawable.champion_fizz, R.string.champion_fizz),

  @SerializedName("Gangplank")
  GANGPLANK(R.drawable.champion_gangplank, R.string.champion_gangplank),

  @SerializedName("Gnar")
  GNAR(R.drawable.champion_gnar, R.string.champion_gnar),

  @SerializedName("Graves")
  GRAVES(R.drawable.champion_graves, R.string.champion_graves),

  @SerializedName("Illaoi")
  ILLAOI(R.drawable.champion_illaoi, R.string.champion_illaoi),

  @SerializedName("Irelia")
  IRELIA(R.drawable.champion_irelia, R.string.champion_irelia),

  @SerializedName("Janna")
  JANNA(R.drawable.champion_janna, R.string.champion_janna),

  @SerializedName("Jarvan IV")
  JARVAN_IV(R.drawable.champion_jarvaniv, R.string.champion_jarvaniv),

  @SerializedName("Jayce")
  JAYCE(R.drawable.champion_jayce, R.string.champion_jayce),

  @SerializedName("Jhin")
  JHIN(R.drawable.champion_jhin, R.string.champion_jhin),

  @SerializedName("Jinx")
  JINX(R.drawable.champion_jinx, R.string.champion_jinx),

  @SerializedName("Karma")
  KARMA(R.drawable.champion_karma, R.string.champion_karma),

  @SerializedName("Kog'Maw")
  KOG_MAW(R.drawable.champion_kogmaw, R.string.champion_kogmaw),

  @SerializedName("Leona")
  LEONA(R.drawable.champion_leona, R.string.champion_leona),

  @SerializedName("Lucian")
  LUCIAN(R.drawable.champion_lucian, R.string.champion_lucian),

  @SerializedName("Lulu")
  LULU(R.drawable.champion_lulu, R.string.champion_lulu),

  @SerializedName("Malphite")
  MALPHITE(R.drawable.champion_malphite, R.string.champion_malphite),

  @SerializedName("Master Yi")
  MASTER_YI(R.drawable.champion_masteryi, R.string.champion_masteryi),

  @SerializedName("Mordekaiser")
  MORDEKAISER(R.drawable.champion_mordekaiser, R.string.champion_mordekaiser),

  @SerializedName("Nautilus")
  NAUTILUS(R.drawable.champion_nautilus, R.string.champion_nautilus),

  @SerializedName("Neeko")
  NEEKO(R.drawable.champion_neeko, R.string.champion_neeko),

  @SerializedName("Nocturne")
  NOCTURNE(R.drawable.champion_nocturne, R.string.champion_nocturne),

  @SerializedName("Poppy")
  POPPY(R.drawable.champion_poppy, R.string.champion_poppy),

  @SerializedName("Rakan")
  RAKAN(R.drawable.champion_rakan, R.string.champion_rakan),

  @SerializedName("Riven")
  RIVEN(R.drawable.champion_riven, R.string.champion_riven),

  @SerializedName("Rumble")
  RUMBLE(R.drawable.champion_rumble, R.string.champion_rumble),

  @SerializedName("Shaco")
  SHACO(R.drawable.champion_shaco, R.string.champion_shaco),

  @SerializedName("Shen")
  SHEN(R.drawable.champion_shen, R.string.champion_shen),

  @SerializedName("Soraka")
  SORAKA(R.drawable.champion_soraka, R.string.champion_soraka),

  @SerializedName("Syndra")
  SYNDRA(R.drawable.champion_syndra, R.string.champion_syndra),

  @SerializedName("Teemo")
  TEEMO(R.drawable.champion_teemo, R.string.champion_teemo),

  @SerializedName("Thresh")
  THRESH(R.drawable.champion_thresh, R.string.champion_thresh),

  @SerializedName("Twisted Fate")
  TWISTED_FATE(R.drawable.champion_twistedfate, R.string.champion_twistedfate),

  @SerializedName("Urgot")
  URGOT(R.drawable.champion_urgot, R.string.champion_urgot),

  @SerializedName("Vayne")
  VAYNE(R.drawable.champion_vayne, R.string.champion_vayne),

  @SerializedName("Vi")
  VI(R.drawable.champion_vi, R.string.champion_vi),

  @SerializedName("Viktor")
  VIKTOR(R.drawable.champion_viktor, R.string.champion_viktor),

  @SerializedName("Wukong")
  WUKONG(R.drawable.champion_wukong, R.string.champion_wukong),

  @SerializedName("Xayah")
  XAYAH(R.drawable.champion_xayah, R.string.champion_xayah),

  @SerializedName("Xerath")
  XERATH(R.drawable.champion_xerath, R.string.champion_xerath),

  @SerializedName("Xin Zhao")
  XIN_ZHAO(R.drawable.champion_xinzhao, R.string.champion_xinzhao),

  @SerializedName("Yasuo")
  YASUO(R.drawable.champion_yasuo, R.string.champion_yasuo),

  @SerializedName("Zed")
  ZED(R.drawable.champion_zed, R.string.champion_zed),

  @SerializedName("Ziggs")
  ZIGGS(R.drawable.champion_ziggs, R.string.champion_ziggs),

  @SerializedName("Zoe")
  ZOE(R.drawable.champion_zoe, R.string.champion_zoe)
}
