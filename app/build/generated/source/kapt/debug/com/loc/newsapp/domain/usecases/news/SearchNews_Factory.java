package com.loc.newsapp.domain.usecases.news;

import com.loc.newsapp.domain.repository.NewsRepository;
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
public final class SearchNews_Factory implements Factory<SearchNews> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  public SearchNews_Factory(Provider<NewsRepository> newsRepositoryProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
  }

  @Override
  public SearchNews get() {
    return newInstance(newsRepositoryProvider.get());
  }

  public static SearchNews_Factory create(Provider<NewsRepository> newsRepositoryProvider) {
    return new SearchNews_Factory(newsRepositoryProvider);
  }

  public static SearchNews newInstance(NewsRepository newsRepository) {
    return new SearchNews(newsRepository);
  }
}
