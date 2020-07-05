package com.github.jhamin0511.teamfighttactics.widget.listener

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric.getForegroundThreadScheduler

@RunWith(AndroidJUnit4::class)
class SafeOnClickListenerTest {

  companion object {
    private val BOOT_TIME = 10000L
  }

  private val listener = SafeOnClickListener(onSafeClick = {})

  @Before
  fun setUp() {
    getForegroundThreadScheduler().advanceTo(BOOT_TIME)
  }

  @Test
  fun checkClicked_Duplicated_SecendClickTrue() {
    val fistClick = listener.checkClicked()
    assertThat(fistClick).isFalse()

    getForegroundThreadScheduler().advanceTo(BOOT_TIME + 500)

    val secendClick = listener.checkClicked()
    assertThat(secendClick).isTrue()
  }

  @Test
  fun checkClicked_NotDuplicated_SecendClickFalse() {
    val fistClick = listener.checkClicked()
    assertThat(fistClick).isFalse()

    getForegroundThreadScheduler().advanceTo(BOOT_TIME * 2)

    val secendClick = listener.checkClicked()
    assertThat(secendClick).isFalse()
  }

}
