package com.raian.newsappproject.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.db.NewsDatabase
import com.raian.newsappproject.models.Bookmark
import com.raian.newsappproject.models.TempArticle
import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
class NewsViewModel(application: Application) : AndroidViewModel(application) {
    lateinit var repository: NewsRepository
    lateinit var bookMarkNews: LiveData<List<Bookmark>>
    val readAllBusinessNews: LiveData<List<TempArticle>>
    val readAllSportsNews: LiveData<List<TempArticle>>
    val readAllSciencesNews: LiveData<List<TempArticle>>
    val readAllTechnologyNews: LiveData<List<TempArticle>>
    val readAllHealthNews: LiveData<List<TempArticle>>
    val readAllEntertainmentNews: LiveData<List<TempArticle>>

    init {
        Log.e("Error", "init")
        val applicationDao = NewsDatabase.getDatabase(application)?.newsDao()
        repository = applicationDao?.let { NewsRepository(it) }!!
        bookMarkNews = repository.getAllBookMarkNews()
        readAllBusinessNews = repository.getBusinessNews()
        readAllSportsNews = repository.getSportsNews()
        readAllSciencesNews = repository.getScienceNews()
        readAllTechnologyNews = repository.getTechnologyNews()
        readAllHealthNews = repository.getHealthNews()
        readAllEntertainmentNews = repository.getEntertainmentNews()
    }

    fun reloadAllApi() {
        try {
            GlobalScope.launch {
                viewModelScope.launch(Dispatchers.IO) {
                    repository.refreshTechnology()
                    repository.refreshSportsTab()
                    repository.refreshScienceTab()
                    repository.refreshTopNewsTab()
                }
            }

        } catch (e: Exception) {
            Log.d("Error", "reloadAllApi: Exception")
        }

    }

    fun addBookMarkArticle(article: Bookmark) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertBookMarkArticle(article)
        }
    }

    fun updateArticle(article: TempArticle) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateArticle(article)
        }
    }

    fun deleteBookBarkArticle(bookMarkNews: Bookmark) {
        viewModelScope.launch {
            repository.deleteBookMarKArticle(bookMarkNews)
        }
    }


}