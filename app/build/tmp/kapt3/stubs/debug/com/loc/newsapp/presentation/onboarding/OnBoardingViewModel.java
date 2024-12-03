package com.loc.newsapp.presentation.onboarding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/loc/newsapp/presentation/onboarding/OnBoardingViewModel;", "Landroidx/lifecycle/ViewModel;", "saveAppEntry", "Lcom/loc/newsapp/domain/usecases/app_entry/SaveAppEntry;", "(Lcom/loc/newsapp/domain/usecases/app_entry/SaveAppEntry;)V", "onEvent", "", "event", "Lcom/loc/newsapp/presentation/onboarding/OnBoardingEvent;", "saveUserEntry", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class OnBoardingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.loc.newsapp.domain.usecases.app_entry.SaveAppEntry saveAppEntry = null;
    
    @javax.inject.Inject
    public OnBoardingViewModel(@org.jetbrains.annotations.NotNull
    com.loc.newsapp.domain.usecases.app_entry.SaveAppEntry saveAppEntry) {
        super();
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.loc.newsapp.presentation.onboarding.OnBoardingEvent event) {
    }
    
    private final void saveUserEntry() {
    }
}