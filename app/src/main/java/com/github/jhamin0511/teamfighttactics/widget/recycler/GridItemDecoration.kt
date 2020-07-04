package com.github.jhamin0511.teamfighttactics.widget.recycler

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import kotlin.math.roundToInt

class GridItemDecoration(
  private val spanCount: Int
) : ItemDecoration() {

  companion object {
    private const val SPACING = 5f
  }

  override fun getItemOffsets(
    outRect: Rect,
    view: View,
    parent: RecyclerView,
    state: RecyclerView.State
  ) {
    val spacing = (SPACING * parent.context.resources.displayMetrics.density).roundToInt()
    val position = parent.getChildAdapterPosition(view)
    val column = position % spanCount

    outRect.left = spacing - column * spacing / spanCount
    outRect.right = (column + 1) * spacing / spanCount
    outRect.top = if (position < spanCount) spacing else 0
    outRect.bottom = spacing
  }

}
