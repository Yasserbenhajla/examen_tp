package com.loc.newsapp.data.manger;

import android.app.Application;
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
public final class LocalUserMangerImpl_Factory implements Factory<LocalUserMangerImpl> {
  private final Provider<Application> applicationProvider;

  public LocalUserMangerImpl_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocalUserMangerImpl get() {
    return newInstance(applicationProvider.get());
  }

  public static LocalUserMangerImpl_Factory create(Provider<Application> applicationProvider) {
    return new LocalUserMangerImpl_Factory(applicationProvider);
  }

  public static LocalUserMangerImpl newInstance(Application application) {
    return new LocalUserMangerImpl(application);
  }
}
