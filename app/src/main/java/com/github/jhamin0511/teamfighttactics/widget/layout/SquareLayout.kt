package com.github.jhamin0511.teamfighttactics.widget.layout

import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

class SquareLayout
@JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    when (resources.configuration.orientation) {
      Configuration.ORIENTATION_PORTRAIT -> {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
      }
      Configuration.ORIENTATION_LANDSCAPE -> {
        super.onMeasure(heightMeasureSpec, heightMeasureSpec)
      }
      else -> {
        throw IllegalArgumentException("not support orientation.")
      }
    }
  }

}
