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
public final class ReadAppEntry_Factory implements Factory<ReadAppEntry> {
  private final Provider<LocalUserManger> localUserMangerProvider;

  public ReadAppEntry_Factory(Provider<LocalUserManger> localUserMangerProvider) {
    this.localUserMangerProvider = localUserMangerProvider;
  }

  @Override
  public ReadAppEntry get() {
    return newInstance(localUserMangerProvider.get());
  }

  public static ReadAppEntry_Factory create(Provider<LocalUserManger> localUserMangerProvider) {
    return new ReadAppEntry_Factory(localUserMangerProvider);
  }

  public static ReadAppEntry newInstance(LocalUserManger localUserManger) {
    return new ReadAppEntry(localUserManger);
  }
}
