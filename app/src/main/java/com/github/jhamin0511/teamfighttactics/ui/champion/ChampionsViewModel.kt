package com.github.jhamin0511.teamfighttactics.ui.champion

import android.app.Application
import com.github.jhamin0511.teamfighttactics.data.dto.champion.ChampionDto
import com.github.jhamin0511.teamfighttactics.data.mapper.champion.ChampionMapper
import com.github.jhamin0511.teamfighttactics.data.vo.champion.ChampionVo
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
  private val mapper = ChampionMapper()
  private lateinit var items: List<ChampionDto>
  lateinit var recyclerQuery: RecyclerQuery<ChampionVo>

  fun loadData() {
    val champions = configRepository.getChampions()
    items = champions.items
    val item = mapper.toVos(items).sortedBy { it.cost }

    recyclerQuery.setItems(item)
  }

  override fun onClick(position: Int) {
    val item = items[position]
    Timber.i("Recycler OnClick ${item}")
  }

  override fun onLongClick(position: Int): Boolean {
    val item = items[position]
    Timber.i("Recycler onLongClick ${item}")

    return true
  }

}
