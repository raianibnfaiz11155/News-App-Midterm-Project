package com.raian.newsappproject.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/raian/newsappproject/fragment/HealthFragment;", "Landroidx/fragment/app/Fragment;", "()V", "listNews", "Ljava/util/ArrayList;", "Lcom/raian/newsappproject/models/TempArticle;", "getListNews", "()Ljava/util/ArrayList;", "setListNews", "(Ljava/util/ArrayList;)V", "networkUtil", "Lcom/raian/newsappproject/network/NetworkUtil;", "getNetworkUtil", "()Lcom/raian/newsappproject/network/NetworkUtil;", "setNetworkUtil", "(Lcom/raian/newsappproject/network/NetworkUtil;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "repository", "Lcom/raian/newsappproject/Repository/NewsRepository;", "getRepository", "()Lcom/raian/newsappproject/Repository/NewsRepository;", "setRepository", "(Lcom/raian/newsappproject/Repository/NewsRepository;)V", "swapRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_debug"})
public final class HealthFragment extends androidx.fragment.app.Fragment {
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swapRefresh;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    public com.raian.newsappproject.Repository.NewsRepository repository;
    public com.raian.newsappproject.network.NetworkUtil networkUtil;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.raian.newsappproject.models.TempArticle> listNews;
    private java.util.HashMap _$_findViewCache;
    
    public HealthFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raian.newsappproject.Repository.NewsRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.Repository.NewsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raian.newsappproject.network.NetworkUtil getNetworkUtil() {
        return null;
    }
    
    public final void setNetworkUtil(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.network.NetworkUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.raian.newsappproject.models.TempArticle> getListNews() {
        return null;
    }
    
    public final void setListNews(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.raian.newsappproject.models.TempArticle> p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}