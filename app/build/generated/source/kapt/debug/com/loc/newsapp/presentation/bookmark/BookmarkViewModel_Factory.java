package com.loc.newsapp.presentation.bookmark;

import com.loc.newsapp.domain.usecases.news.GetSavedArticles;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class BookmarkViewModel_Factory implements Factory<BookmarkViewModel> {
  private final Provider<GetSavedArticles> getSavedArticlesUseCaseProvider;

  public BookmarkViewModel_Factory(Provider<GetSavedArticles> getSavedArticlesUseCaseProvider) {
    this.getSavedArticlesUseCaseProvider = getSavedArticlesUseCaseProvider;
  }

  @Override
  public BookmarkViewModel get() {
    return newInstance(getSavedArticlesUseCaseProvider.get());
  }

  public static BookmarkViewModel_Factory create(
      Provider<GetSavedArticles> getSavedArticlesUseCaseProvider) {
    return new BookmarkViewModel_Factory(getSavedArticlesUseCaseProvider);
  }

  public static BookmarkViewModel newInstance(GetSavedArticles getSavedArticlesUseCase) {
    return new BookmarkViewModel(getSavedArticlesUseCase);
  }
}
