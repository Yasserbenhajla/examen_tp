package com.loc.newsapp.presentation.mainActivity;

import com.loc.newsapp.domain.usecases.app_entry.ReadAppEntry;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<ReadAppEntry> readAppEntryProvider;

  public MainViewModel_Factory(Provider<ReadAppEntry> readAppEntryProvider) {
    this.readAppEntryProvider = readAppEntryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(readAppEntryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<ReadAppEntry> readAppEntryProvider) {
    return new MainViewModel_Factory(readAppEntryProvider);
  }

  public static MainViewModel newInstance(ReadAppEntry readAppEntry) {
    return new MainViewModel(readAppEntry);
  }
}
