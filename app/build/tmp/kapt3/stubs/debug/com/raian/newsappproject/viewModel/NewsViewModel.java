package com.raian.newsappproject.viewModel;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\bJ\u0006\u0010$\u001a\u00020!J\u000e\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006&"}, d2 = {"Lcom/raian/newsappproject/viewModel/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "bookMarkNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/raian/newsappproject/models/Bookmark;", "getBookMarkNews", "()Landroidx/lifecycle/LiveData;", "setBookMarkNews", "(Landroidx/lifecycle/LiveData;)V", "readAllBusinessNews", "Lcom/raian/newsappproject/models/TempArticle;", "getReadAllBusinessNews", "readAllEntertainmentNews", "getReadAllEntertainmentNews", "readAllHealthNews", "getReadAllHealthNews", "readAllSciencesNews", "getReadAllSciencesNews", "readAllSportsNews", "getReadAllSportsNews", "readAllTechnologyNews", "getReadAllTechnologyNews", "repository", "Lcom/raian/newsappproject/Repository/NewsRepository;", "getRepository", "()Lcom/raian/newsappproject/Repository/NewsRepository;", "setRepository", "(Lcom/raian/newsappproject/Repository/NewsRepository;)V", "addBookMarkArticle", "", "article", "deleteBookBarkArticle", "reloadAllApi", "updateArticle", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    public com.raian.newsappproject.Repository.NewsRepository repository;
    public androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> bookMarkNews;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllBusinessNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllSportsNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllSciencesNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllTechnologyNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllHealthNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> readAllEntertainmentNews = null;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raian.newsappproject.Repository.NewsRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.Repository.NewsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> getBookMarkNews() {
        return null;
    }
    
    public final void setBookMarkNews(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.Bookmark>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllBusinessNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllSportsNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllSciencesNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllTechnologyNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllHealthNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raian.newsappproject.models.TempArticle>> getReadAllEntertainmentNews() {
        return null;
    }
    
    public final void reloadAllApi() {
    }
    
    public final void addBookMarkArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark article) {
    }
    
    public final void updateArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.TempArticle article) {
    }
    
    public final void deleteBookBarkArticle(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.models.Bookmark bookMarkNews) {
    }
}