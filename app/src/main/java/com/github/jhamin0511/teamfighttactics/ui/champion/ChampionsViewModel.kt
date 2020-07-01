package com.github.jhamin0511.teamfighttactics.ui.champion

import android.app.Application
import com.github.jhamin0511.teamfighttactics.data.dto.champion.ChampionDto
import com.github.jhamin0511.teamfighttactics.ui.base.BaseViewModel
import com.github.jhamin0511.teamfighttactics.widget.recycler.RecyclerListener
import com.github.jhamin0511.teamfighttactics.widget.recycler.RecyclerQuery
import timber.log.Timber

class ChampionsViewModel(
  application: Application
) : BaseViewModel(application), RecyclerListener {

  // ========== MODEL ==========
  var recyclerQuery: RecyclerQuery<ChampionDto>? = null

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
