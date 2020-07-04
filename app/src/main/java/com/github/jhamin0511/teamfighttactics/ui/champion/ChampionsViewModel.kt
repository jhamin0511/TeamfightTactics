package com.github.jhamin0511.teamfighttactics.ui.champion

import android.app.Application
import com.github.jhamin0511.teamfighttactics.data.dto.champion.Champion
import com.github.jhamin0511.teamfighttactics.data.dto.champion.ChampionDto
import com.github.jhamin0511.teamfighttactics.data.dto.champion.Cost
import com.github.jhamin0511.teamfighttactics.data.dto.champion.Trait
import com.github.jhamin0511.teamfighttactics.ui.base.BaseViewModel
import com.github.jhamin0511.teamfighttactics.widget.recycler.RecyclerListener
import com.github.jhamin0511.teamfighttactics.widget.recycler.RecyclerQuery
import timber.log.Timber

class ChampionsViewModel(
  application: Application
) : BaseViewModel(application), RecyclerListener {

  // ========== MODEL ==========
  lateinit var recyclerQuery: RecyclerQuery<ChampionDto>

  fun loadData() {
    recyclerQuery.setItems(
      listOf(
        ChampionDto(Champion.AHRI, "", Cost.UNCOMMON, listOf(Trait.STARGUARIAN, Trait.SORCERER)),
        ChampionDto(Champion.ANNIE, "", Cost.UNCOMMON, listOf(Trait.MECHPILOT, Trait.SORCERER)),
        ChampionDto(Champion.ASHE, "", Cost.RARE, listOf(Trait.CELESTIAL, Trait.SNIPER)),
        ChampionDto(Champion.AURELION_SOL, "", Cost.LEGENDARY, listOf(Trait.REBEL, Trait.STARSHIP)),
        ChampionDto(Champion.BARD, "", Cost.RARE, listOf(Trait.ASTRO, Trait.MYSTIC)),
        ChampionDto(Champion.BLITZCRANK, "", Cost.UNCOMMON, listOf(Trait.CHRONO, Trait.BRAWLER)),
        ChampionDto(Champion.CAITLYN, "", Cost.COMMON, listOf(Trait.CHRONO, Trait.SNIPER)),
        ChampionDto(Champion.CASSIOPEIA, "", Cost.RARE, listOf(Trait.BATTLECAST, Trait.MYSTIC))
      )
    )
  }

  override fun onClick(position: Int) {
    val item = recyclerQuery?.getItem(position)
    Timber.i("Recycler OnClick ${item}")
  }

  override fun onLongClick(position: Int): Boolean {
    val item = recyclerQuery?.getItem(position)
    Timber.i("Recycler onLongClick ${item}")

    return true
  }

}
