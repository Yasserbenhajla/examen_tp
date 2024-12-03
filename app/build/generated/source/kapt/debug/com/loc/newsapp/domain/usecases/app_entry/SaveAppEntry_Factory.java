package com.loc.newsapp.domain.usecases.app_entry;

import com.loc.newsapp.domain.manger.LocalUserManger;
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
public final class SaveAppEntry_Factory implements Factory<SaveAppEntry> {
  private final Provider<LocalUserManger> localUserMangerProvider;

  public SaveAppEntry_Factory(Provider<LocalUserManger> localUserMangerProvider) {
    this.localUserMangerProvider = localUserMangerProvider;
  }

  @Override
  public SaveAppEntry get() {
    return newInstance(localUserMangerProvider.get());
  }

  public static SaveAppEntry_Factory create(Provider<LocalUserManger> localUserMangerProvider) {
    return new SaveAppEntry_Factory(localUserMangerProvider);
  }

  public static SaveAppEntry newInstance(LocalUserManger localUserManger) {
    return new SaveAppEntry(localUserManger);
  }
}
