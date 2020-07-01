package com.github.jhamin0511.teamfighttactics.ui.champion

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.github.jhamin0511.teamfighttactics.R
import com.github.jhamin0511.teamfighttactics.databinding.ChampionsFragmentBinding
import com.github.jhamin0511.teamfighttactics.ui.base.BaseFragment
import com.github.jhamin0511.teamfighttactics.widget.recycler.GridItemDecoration
import org.koin.android.viewmodel.ext.android.viewModel

class ChampionsFragment : BaseFragment() {

  private lateinit var binding: ChampionsFragmentBinding
  private val viewModel: ChampionsViewModel by viewModel()
  private lateinit var adapter: ChampionsAdapter

  override fun getLayoutId() = R.layout.champions_fragment

  override fun onValue(savedInstanceState: Bundle?) {
    adapter = ChampionsAdapter(viewModel)
    viewModel.recyclerQuery = adapter.getQuery()
  }

  override fun onView(view: View, savedInstanceState: Bundle?) {
    binding = DataBindingUtil.bind(view)!!
    binding.lifecycleOwner = this

    val spanCount = 4
    val manager = GridLayoutManager(requireContext(), spanCount)
    val decoration = GridItemDecoration(spanCount)
    binding.list.layoutManager = manager
    binding.list.addItemDecoration(decoration)
    binding.list.adapter = adapter
  }

  override fun onEvent() {
  }

}
