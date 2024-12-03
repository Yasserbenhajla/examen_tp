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
public final class DeleteArticle_Factory implements Factory<DeleteArticle> {
  private final Provider<NewsDao> newsDaoProvider;

  public DeleteArticle_Factory(Provider<NewsDao> newsDaoProvider) {
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public DeleteArticle get() {
    return newInstance(newsDaoProvider.get());
  }

  public static DeleteArticle_Factory create(Provider<NewsDao> newsDaoProvider) {
    return new DeleteArticle_Factory(newsDaoProvider);
  }

  public static DeleteArticle newInstance(NewsDao newsDao) {
    return new DeleteArticle(newsDao);
  }
}
