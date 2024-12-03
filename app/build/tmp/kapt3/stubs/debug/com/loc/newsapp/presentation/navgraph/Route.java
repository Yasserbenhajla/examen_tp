package com.loc.newsapp.presentation.navgraph;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route;", "", "route", "", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "(Ljava/lang/String;Ljava/util/List;)V", "getArguments", "()Ljava/util/List;", "getRoute", "()Ljava/lang/String;", "AppStartNavigation", "BookmarkScreen", "DetailsScreen", "HomeScreen", "NewsNavigation", "NewsNavigatorScreen", "OnBoardingScreen", "SearchScreen", "Lcom/loc/newsapp/presentation/navgraph/Route$AppStartNavigation;", "Lcom/loc/newsapp/presentation/navgraph/Route$BookmarkScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route$DetailsScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route$HomeScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route$NewsNavigation;", "Lcom/loc/newsapp/presentation/navgraph/Route$NewsNavigatorScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route$OnBoardingScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route$SearchScreen;", "app_debug"})
public abstract class Route {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<androidx.navigation.NamedNavArgument> arguments = null;
    
    private Route(java.lang.String route, java.util.List<androidx.navigation.NamedNavArgument> arguments) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<androidx.navigation.NamedNavArgument> getArguments() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$AppStartNavigation;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class AppStartNavigation extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.AppStartNavigation INSTANCE = null;
        
        private AppStartNavigation() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$BookmarkScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class BookmarkScreen extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.BookmarkScreen INSTANCE = null;
        
        private BookmarkScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$DetailsScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class DetailsScreen extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.DetailsScreen INSTANCE = null;
        
        private DetailsScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$HomeScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class HomeScreen extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$NewsNavigation;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class NewsNavigation extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.NewsNavigation INSTANCE = null;
        
        private NewsNavigation() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$NewsNavigatorScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class NewsNavigatorScreen extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.NewsNavigatorScreen INSTANCE = null;
        
        private NewsNavigatorScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$OnBoardingScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class OnBoardingScreen extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.OnBoardingScreen INSTANCE = null;
        
        private OnBoardingScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loc/newsapp/presentation/navgraph/Route$SearchScreen;", "Lcom/loc/newsapp/presentation/navgraph/Route;", "()V", "app_debug"})
    public static final class SearchScreen extends com.loc.newsapp.presentation.navgraph.Route {
        @org.jetbrains.annotations.NotNull
        public static final com.loc.newsapp.presentation.navgraph.Route.SearchScreen INSTANCE = null;
        
        private SearchScreen() {
        }
    }
}