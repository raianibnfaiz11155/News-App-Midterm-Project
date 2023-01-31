package com.raian.newsappproject.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/raian/newsappproject/adapter/NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raian/newsappproject/adapter/NewsAdapter$NewsViewHolder;", "context", "Landroid/content/Context;", "viewModel", "Lcom/raian/newsappproject/viewModel/NewsViewModel;", "arrayList", "", "Lcom/raian/newsappproject/models/TempArticle;", "(Landroid/content/Context;Lcom/raian/newsappproject/viewModel/NewsViewModel;Ljava/util/List;)V", "theNewsList", "filter", "", "text", "", "filterList", "filterlist", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NewsViewHolder", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raian.newsappproject.adapter.NewsAdapter.NewsViewHolder> {
    private final android.content.Context context = null;
    private final com.raian.newsappproject.viewModel.NewsViewModel viewModel = null;
    private final java.util.List<com.raian.newsappproject.models.TempArticle> arrayList = null;
    private java.util.List<com.raian.newsappproject.models.TempArticle> theNewsList;
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.viewModel.NewsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    java.util.List<com.raian.newsappproject.models.TempArticle> arrayList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raian.newsappproject.adapter.NewsAdapter.NewsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raian.newsappproject.adapter.NewsAdapter.NewsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void filterList(java.util.List<com.raian.newsappproject.models.TempArticle> filterlist) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/raian/newsappproject/adapter/NewsAdapter$NewsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroid/view/View;", "(Landroid/view/View;)V", "favButton", "Landroidx/constraintlayout/utils/widget/ImageFilterButton;", "getFavButton", "()Landroidx/constraintlayout/utils/widget/ImageFilterButton;", "itemAuthor", "Landroid/widget/TextView;", "getItemAuthor", "()Landroid/widget/TextView;", "itemDate", "getItemDate", "itemDetail", "getItemDetail", "itemPicture", "Landroid/widget/ImageView;", "getItemPicture", "()Landroid/widget/ImageView;", "itemTitle", "getItemTitle", "newsCard", "Landroidx/cardview/widget/CardView;", "getNewsCard", "()Landroidx/cardview/widget/CardView;", "app_debug"})
    public static final class NewsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.View binding = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView itemTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView itemDetail = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView itemAuthor = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView itemPicture = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView itemDate = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView newsCard = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.utils.widget.ImageFilterButton favButton = null;
        
        public NewsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemDetail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getItemPicture() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getNewsCard() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.utils.widget.ImageFilterButton getFavButton() {
            return null;
        }
    }
}