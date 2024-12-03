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
public final class GetNews_Factory implements Factory<GetNews> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  public GetNews_Factory(Provider<NewsRepository> newsRepositoryProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
  }

  @Override
  public GetNews get() {
    return newInstance(newsRepositoryProvider.get());
  }

  public static GetNews_Factory create(Provider<NewsRepository> newsRepositoryProvider) {
    return new GetNews_Factory(newsRepositoryProvider);
  }

  public static GetNews newInstance(NewsRepository newsRepository) {
    return new GetNews(newsRepository);
  }
}
