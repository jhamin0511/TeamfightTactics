package com.github.jhamin0511.teamfighttactics.binding

import android.util.TypedValue.COMPLEX_UNIT_DIP
import android.util.TypedValue.applyDimension
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.constraintlayout.widget.Constraints
import androidx.databinding.BindingAdapter
import com.github.jhamin0511.teamfighttactics.data.dto.champion.Trait

object BindingAdapter {

  @JvmStatic
  @BindingAdapter("bindTraits")
  fun bindTraits(layout: LinearLayout, traits: List<Trait>) {
    traits.forEach {
      val imageView = ImageView(layout.context)
      val size = applyDimension(COMPLEX_UNIT_DIP, 20f, layout.resources.displayMetrics).toInt()
      val layoutParams = Constraints.LayoutParams(size, size)

      imageView.layoutParams = layoutParams
      imageView.setImageResource(it.imageRes)
      layout.addView(imageView)
    }
  }

  @JvmStatic
  @BindingAdapter("bindImage")
  fun bindImage(view: ImageView, @DrawableRes res: Int) {
    view.setImageResource(res)
  }

  @JvmStatic
  @BindingAdapter("bindBackgroundColor")
  fun bindBackgroundColor(view: View, @ColorRes res: Int) {
    view.setBackgroundResource(res)
  }

}
