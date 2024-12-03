package com.loc.newsapp.presentation.details;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0019\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/loc/newsapp/presentation/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "getSavedArticleUseCase", "Lcom/loc/newsapp/domain/usecases/news/GetSavedArticle;", "deleteArticleUseCase", "Lcom/loc/newsapp/domain/usecases/news/DeleteArticle;", "upsertArticleUseCase", "Lcom/loc/newsapp/domain/usecases/news/UpsertArticle;", "(Lcom/loc/newsapp/domain/usecases/news/GetSavedArticle;Lcom/loc/newsapp/domain/usecases/news/DeleteArticle;Lcom/loc/newsapp/domain/usecases/news/UpsertArticle;)V", "<set-?>", "Lcom/loc/newsapp/util/UIComponent;", "sideEffect", "getSideEffect", "()Lcom/loc/newsapp/util/UIComponent;", "setSideEffect", "(Lcom/loc/newsapp/util/UIComponent;)V", "sideEffect$delegate", "Landroidx/compose/runtime/MutableState;", "deleteArticle", "", "article", "Lcom/loc/newsapp/domain/model/Article;", "(Lcom/loc/newsapp/domain/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onEvent", "event", "Lcom/loc/newsapp/presentation/details/DetailsEvent;", "upsertArticle", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.loc.newsapp.domain.usecases.news.GetSavedArticle getSavedArticleUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.loc.newsapp.domain.usecases.news.DeleteArticle deleteArticleUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.loc.newsapp.domain.usecases.news.UpsertArticle upsertArticleUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState sideEffect$delegate = null;
    
    @javax.inject.Inject
    public DetailsViewModel(@org.jetbrains.annotations.NotNull
    com.loc.newsapp.domain.usecases.news.GetSavedArticle getSavedArticleUseCase, @org.jetbrains.annotations.NotNull
    com.loc.newsapp.domain.usecases.news.DeleteArticle deleteArticleUseCase, @org.jetbrains.annotations.NotNull
    com.loc.newsapp.domain.usecases.news.UpsertArticle upsertArticleUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loc.newsapp.util.UIComponent getSideEffect() {
        return null;
    }
    
    private final void setSideEffect(com.loc.newsapp.util.UIComponent p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.loc.newsapp.presentation.details.DetailsEvent event) {
    }
    
    private final java.lang.Object deleteArticle(com.loc.newsapp.domain.model.Article article, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object upsertArticle(com.loc.newsapp.domain.model.Article article, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}