package com.loc.newsapp.domain.usecases.news;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/loc/newsapp/domain/usecases/news/GetSavedArticle;", "", "newsDao", "Lcom/loc/newsapp/data/local/NewsDao;", "(Lcom/loc/newsapp/data/local/NewsDao;)V", "invoke", "Lcom/loc/newsapp/domain/model/Article;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetSavedArticle {
    @org.jetbrains.annotations.NotNull
    private final com.loc.newsapp.data.local.NewsDao newsDao = null;
    
    @javax.inject.Inject
    public GetSavedArticle(@org.jetbrains.annotations.NotNull
    com.loc.newsapp.data.local.NewsDao newsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.loc.newsapp.domain.model.Article> $completion) {
        return null;
    }
}