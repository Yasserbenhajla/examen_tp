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
public final class GetSavedArticles_Factory implements Factory<GetSavedArticles> {
  private final Provider<NewsDao> newsDaoProvider;

  public GetSavedArticles_Factory(Provider<NewsDao> newsDaoProvider) {
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public GetSavedArticles get() {
    return newInstance(newsDaoProvider.get());
  }

  public static GetSavedArticles_Factory create(Provider<NewsDao> newsDaoProvider) {
    return new GetSavedArticles_Factory(newsDaoProvider);
  }

  public static GetSavedArticles newInstance(NewsDao newsDao) {
    return new GetSavedArticles(newsDao);
  }
}
