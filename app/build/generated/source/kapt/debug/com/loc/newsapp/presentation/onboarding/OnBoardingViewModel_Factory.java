package com.loc.newsapp.presentation.onboarding;

import com.loc.newsapp.domain.usecases.app_entry.SaveAppEntry;
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
public final class OnBoardingViewModel_Factory implements Factory<OnBoardingViewModel> {
  private final Provider<SaveAppEntry> saveAppEntryProvider;

  public OnBoardingViewModel_Factory(Provider<SaveAppEntry> saveAppEntryProvider) {
    this.saveAppEntryProvider = saveAppEntryProvider;
  }

  @Override
  public OnBoardingViewModel get() {
    return newInstance(saveAppEntryProvider.get());
  }

  public static OnBoardingViewModel_Factory create(Provider<SaveAppEntry> saveAppEntryProvider) {
    return new OnBoardingViewModel_Factory(saveAppEntryProvider);
  }

  public static OnBoardingViewModel newInstance(SaveAppEntry saveAppEntry) {
    return new OnBoardingViewModel(saveAppEntry);
  }
}
