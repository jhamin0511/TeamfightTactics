package com.github.jhamin0511.teamfighttactics.data.dto.champion

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.github.jhamin0511.teamfighttactics.R
import com.google.gson.annotations.SerializedName

enum class TraitType(
  @DrawableRes
  val imageRes: Int,
  @StringRes
  val nameRes: Int
) {
  @SerializedName("Star Guardian")
  STARGUARIAN(R.drawable.trait_starguardian, R.string.trait_starguardian),

  @SerializedName("Sorcerer")
  SORCERER(R.drawable.trait_sorcerer, R.string.trait_sorcerer),

  @SerializedName("Mech-Pilot")
  MECHPILOT(R.drawable.trait_mechpilot, R.string.trait_mechpilot),

  @SerializedName("Celestial")
  CELESTIAL(R.drawable.trait_celestial, R.string.trait_celestial),

  @SerializedName("Sniper")
  SNIPER(R.drawable.trait_sniper, R.string.trait_sniper),

  @SerializedName("Rebel")
  REBEL(R.drawable.trait_rebel, R.string.trait_rebel),

  @SerializedName("Starship")
  STARSHIP(R.drawable.trait_starship, R.string.trait_starship),

  @SerializedName("Astro")
  ASTRO(R.drawable.trait_astro, R.string.trait_astro),

  @SerializedName("Chrono")
  CHRONO(R.drawable.trait_chrono, R.string.trait_chrono),

  @SerializedName("Brawler")
  BRAWLER(R.drawable.trait_brawler, R.string.trait_brawler),

  @SerializedName("Battlecast")
  BATTLECAST(R.drawable.trait_battlecast, R.string.trait_battlecast),

  @SerializedName("Space Pirate")
  SPACEPIRATE(R.drawable.trait_spacepirate, R.string.trait_spacepirate),

  @SerializedName("Cybernetic")
  CYBERNETIC(R.drawable.trait_cybernetic, R.string.trait_cybernetic),

  @SerializedName("Infiltrator")
  INFILTRATOR(R.drawable.trait_infiltrator, R.string.trait_infiltrator),

  @SerializedName("Blaster")
  BLASTER(R.drawable.trait_blaster, R.string.trait_blaster),

  @SerializedName("Blademaster")
  BLADEMASTER(R.drawable.trait_blademaster, R.string.trait_blademaster),

  @SerializedName("Mercenary")
  MERCENARY(R.drawable.trait_mercenary, R.string.trait_mercenary),

  @SerializedName("Demolitionist")
  DEMOLITIONIST(R.drawable.trait_demolitionist, R.string.trait_demolitionist),

  @SerializedName("Paragon")
  PARAGON(R.drawable.trait_paragon, R.string.trait_paragon),

  @SerializedName("Protector")
  PROTECTOR(R.drawable.trait_protector, R.string.trait_protector),

  @SerializedName("Vanguard")
  VANGUARD(R.drawable.trait_vanguard, R.string.trait_vanguard),

  @SerializedName("Dark Star")
  DARKSTAR(R.drawable.trait_darkstar, R.string.trait_darkstar),

  @SerializedName("Mystic")
  MYSTIC(R.drawable.trait_mystic, R.string.trait_mystic),

  @SerializedName("Mana-Reaver")
  MANAREAVER(R.drawable.trait_manareaver, R.string.trait_manareaver)
}
