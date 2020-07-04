package com.github.jhamin0511.teamfighttactics.widget.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<ITEM>(
  itemView: View,
  listener: RecyclerListener? = null
) : RecyclerView.ViewHolder(itemView) {

  init {
    listener?.let {
      itemView.setOnClickListener { listener.onClick(adapterPosition) }
      itemView.setOnLongClickListener { listener.onLongClick(adapterPosition) }
    }
  }

  abstract fun bindView(item: ITEM)

}
