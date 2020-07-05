package com.github.jhamin0511.teamfighttactics.widget.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.github.jhamin0511.teamfighttactics.widget.listener.setOnSafeClickListener

abstract class BaseViewHolder<ITEM>(
  itemView: View,
  listener: RecyclerListener? = null
) : RecyclerView.ViewHolder(itemView) {

  init {
    listener?.let {
      itemView.setOnSafeClickListener { listener.onClick(adapterPosition) }
      itemView.setOnLongClickListener { listener.onLongClick(adapterPosition) }
    }
  }

  abstract fun bindView(item: ITEM)

}
