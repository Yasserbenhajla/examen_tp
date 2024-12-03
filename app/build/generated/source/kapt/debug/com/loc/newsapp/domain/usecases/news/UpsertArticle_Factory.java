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
public final class UpsertArticle_Factory implements Factory<UpsertArticle> {
  private final Provider<NewsDao> newsDaoProvider;

  public UpsertArticle_Factory(Provider<NewsDao> newsDaoProvider) {
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public UpsertArticle get() {
    return newInstance(newsDaoProvider.get());
  }

  public static UpsertArticle_Factory create(Provider<NewsDao> newsDaoProvider) {
    return new UpsertArticle_Factory(newsDaoProvider);
  }

  public static UpsertArticle newInstance(NewsDao newsDao) {
    return new UpsertArticle(newsDao);
  }
}
