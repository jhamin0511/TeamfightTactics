package com.github.jhamin0511.teamfighttactics.ui.champion

import android.app.Application
import com.github.jhamin0511.teamfighttactics.data.dto.champion.ChampionDto
import com.github.jhamin0511.teamfighttactics.repository.ConfigRepository
import com.github.jhamin0511.teamfighttactics.ui.base.BaseViewModel
import com.github.jhamin0511.teamfighttactics.widget.recycler.RecyclerListener
import com.github.jhamin0511.teamfighttactics.widget.recycler.RecyclerQuery
import timber.log.Timber

class ChampionsViewModel(
  application: Application,
  private val configRepository: ConfigRepository
) : BaseViewModel(application), RecyclerListener {

  // ========== MODEL ==========
  lateinit var recyclerQuery: RecyclerQuery<ChampionDto>

  fun loadData() {
    val champions = configRepository.getChampions()
    val item = champions.items.sortedBy { it.cost.value }

    recyclerQuery.setItems(item)
  }

  override fun onClick(position: Int) {
    val item = recyclerQuery.getItem(position)
    Timber.i("Recycler OnClick ${item}")
  }

  override fun onLongClick(position: Int): Boolean {
    val item = recyclerQuery.getItem(position)
    Timber.i("Recycler onLongClick ${item}")

    return true
  }

}
