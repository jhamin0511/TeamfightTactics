package com.github.jhamin0511.teamfighttactics.ui.champion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.github.jhamin0511.teamfighttactics.R
import com.github.jhamin0511.teamfighttactics.data.vo.champion.ChampionVo
import com.github.jhamin0511.teamfighttactics.databinding.ChampionItemBinding
import com.github.jhamin0511.teamfighttactics.widget.recycler.BaseRecyclerAdapter
import com.github.jhamin0511.teamfighttactics.widget.recycler.BaseViewHolder

class ChampionsAdapter(
  val viewModel: ChampionsViewModel
) : BaseRecyclerAdapter<ChampionVo>() {

  init {
    viewModel.recyclerQuery = this
  }

  inner class ChampionHolder(
    itemView: View
  ) : BaseViewHolder<ChampionVo>(itemView, viewModel) {
    private val binding: ChampionItemBinding = DataBindingUtil.bind(itemView)!!

    override fun bindView(item: ChampionVo) {
      binding.vo = item
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    val inflater = LayoutInflater.from(parent.context)

    return ChampionHolder(inflater.inflate(R.layout.champion_item, parent, false))
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    val item = getItem(position)

    (holder as ChampionHolder).bindView(item)
  }

}
