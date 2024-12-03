package com.loc.newsapp.presentation.home;

import com.loc.newsapp.domain.usecases.news.GetNews;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetNews> getNewsUseCaseProvider;

  public HomeViewModel_Factory(Provider<GetNews> getNewsUseCaseProvider) {
    this.getNewsUseCaseProvider = getNewsUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getNewsUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<GetNews> getNewsUseCaseProvider) {
    return new HomeViewModel_Factory(getNewsUseCaseProvider);
  }

  public static HomeViewModel newInstance(GetNews getNewsUseCase) {
    return new HomeViewModel(getNewsUseCase);
  }
}
