package com.github.jhamin0511.teamfighttactics.widget.recycler

interface RecyclerListener {

  fun onClick(position: Int)

  /**
   * @see [android.view.View.OnLongClickListener]
   * @return true if the callback consumed the long click, false otherwise. (default : false)
   * */
  fun onLongClick(position: Int): Boolean = false

}
