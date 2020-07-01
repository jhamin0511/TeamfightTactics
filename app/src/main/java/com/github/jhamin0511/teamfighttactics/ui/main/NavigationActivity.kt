package com.github.jhamin0511.teamfighttactics.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.github.jhamin0511.teamfighttactics.R
import com.github.jhamin0511.teamfighttactics.databinding.NavigationActivityBinding

class NavigationActivity : AppCompatActivity() {

  lateinit var binding: NavigationActivityBinding
  private var currentNavController: LiveData<NavController>? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.navigation_activity)
    if (savedInstanceState == null) {
      setupBottomNavigationBar()
    }
  }

  override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    super.onRestoreInstanceState(savedInstanceState)

    setupBottomNavigationBar()
  }

  /**
   * Called on first creation and when restoring state.
   */
  private fun setupBottomNavigationBar() {
    val navGraphIds = listOf(R.navigation.champions, R.navigation.items, R.navigation.info)
    val controller = binding.bottomNav.setupWithNavController(
      navGraphIds,
      supportFragmentManager,
      R.id.nav_host_container,
      intent
    )

    currentNavController = controller
  }

  override fun onSupportNavigateUp(): Boolean {
    return currentNavController?.value?.navigateUp() ?: false
  }

}
