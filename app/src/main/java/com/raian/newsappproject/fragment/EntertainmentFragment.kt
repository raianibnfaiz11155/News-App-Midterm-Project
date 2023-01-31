package com.raian.newsappproject.fragment

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.raian.newsappproject.R
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.adapter.NewsAdapter
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.TempArticle
import com.raian.newsappproject.network.NetworkUtil
import com.raian.newsappproject.viewModel.NewsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EntertainmentFragment : Fragment() {
    private lateinit var swapRefresh: SwipeRefreshLayout
    private lateinit var recyclerView: RecyclerView
    lateinit var repository: NewsRepository
    lateinit var networkUtil: NetworkUtil
    var listNews = ArrayList<TempArticle>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        networkUtil = NetworkUtil(requireContext())
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        inflater.inflate(R.menu.menu_item, menu)
        val item = menu.findItem(R.id.actionSearch)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    val adapter = recyclerView.adapter as NewsAdapter
                    adapter.filter(newText)
                }

                return false
            }
        })
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_entertainment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val applicationDao = NewsDatabase.getDatabase(requireContext())?.newsDao()
        repository = applicationDao?.let { NewsRepository(it) }!!
        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        recyclerView = view.findViewById(R.id.rv_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        val adapter = NewsAdapter(
            requireContext(), viewModel, listNews
        )
        val adapterViewState = recyclerView.layoutManager?.onSaveInstanceState()
        recyclerView.layoutManager?.onRestoreInstanceState(adapterViewState)
        recyclerView.adapter = adapter
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                if (networkUtil.isConnected()) {
                    repository.refreshEntertainmentNewsTab()
                }
            }
        }
        viewModel.readAllEntertainmentNews.observe(viewLifecycleOwner) {
            val adapterViewState = recyclerView.layoutManager?.onSaveInstanceState()
            recyclerView.layoutManager?.onRestoreInstanceState(adapterViewState)
            recyclerView.adapter = NewsAdapter(
                requireContext(), viewModel, it as ArrayList<TempArticle>
            )
        }
        swapRefresh = view.findViewById(R.id.swipeRefreshLayout)
        swapRefresh.setOnRefreshListener {
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                    if (networkUtil.isConnected()) {
                        repository.refreshEntertainmentNewsTab()
                    } else {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(
                                requireContext(),
                                "Not connected to internet!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
            swapRefresh.isRefreshing = false
        }


    }
}