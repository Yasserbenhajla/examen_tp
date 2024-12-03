package com.loc.newsapp.presentation.details;

import com.loc.newsapp.domain.usecases.news.DeleteArticle;
import com.loc.newsapp.domain.usecases.news.GetSavedArticle;
import com.loc.newsapp.domain.usecases.news.UpsertArticle;
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<GetSavedArticle> getSavedArticleUseCaseProvider;

  private final Provider<DeleteArticle> deleteArticleUseCaseProvider;

  private final Provider<UpsertArticle> upsertArticleUseCaseProvider;

  public DetailsViewModel_Factory(Provider<GetSavedArticle> getSavedArticleUseCaseProvider,
      Provider<DeleteArticle> deleteArticleUseCaseProvider,
      Provider<UpsertArticle> upsertArticleUseCaseProvider) {
    this.getSavedArticleUseCaseProvider = getSavedArticleUseCaseProvider;
    this.deleteArticleUseCaseProvider = deleteArticleUseCaseProvider;
    this.upsertArticleUseCaseProvider = upsertArticleUseCaseProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(getSavedArticleUseCaseProvider.get(), deleteArticleUseCaseProvider.get(), upsertArticleUseCaseProvider.get());
  }

  public static DetailsViewModel_Factory create(
      Provider<GetSavedArticle> getSavedArticleUseCaseProvider,
      Provider<DeleteArticle> deleteArticleUseCaseProvider,
      Provider<UpsertArticle> upsertArticleUseCaseProvider) {
    return new DetailsViewModel_Factory(getSavedArticleUseCaseProvider, deleteArticleUseCaseProvider, upsertArticleUseCaseProvider);
  }

  public static DetailsViewModel newInstance(GetSavedArticle getSavedArticleUseCase,
      DeleteArticle deleteArticleUseCase, UpsertArticle upsertArticleUseCase) {
    return new DetailsViewModel(getSavedArticleUseCase, deleteArticleUseCase, upsertArticleUseCase);
  }
}
