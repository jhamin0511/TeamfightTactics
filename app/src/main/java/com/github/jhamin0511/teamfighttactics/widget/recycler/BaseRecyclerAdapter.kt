package com.github.jhamin0511.teamfighttactics.widget.recycler

import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class BaseRecyclerAdapter<ITEM>
  : Adapter<ViewHolder>(), RecyclerQuery<ITEM> {

  private val items: MutableList<ITEM> = mutableListOf()

  override fun getItemCount() = items.size

  override fun setItems(list: List<ITEM>) {
    items.addAll(list)
  }

  override fun getItem(position: Int): ITEM {
    return items[position]
  }

  fun getQuery(): RecyclerQuery<ITEM> {
    return this
  }

}
