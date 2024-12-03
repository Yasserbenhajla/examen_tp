package com.loc.newsapp.domain.usecases.news;

import com.loc.newsapp.data.local.NewsDao;
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
public final class GetSavedArticle_Factory implements Factory<GetSavedArticle> {
  private final Provider<NewsDao> newsDaoProvider;

  public GetSavedArticle_Factory(Provider<NewsDao> newsDaoProvider) {
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public GetSavedArticle get() {
    return newInstance(newsDaoProvider.get());
  }

  public static GetSavedArticle_Factory create(Provider<NewsDao> newsDaoProvider) {
    return new GetSavedArticle_Factory(newsDaoProvider);
  }

  public static GetSavedArticle newInstance(NewsDao newsDao) {
    return new GetSavedArticle(newsDao);
  }
}
