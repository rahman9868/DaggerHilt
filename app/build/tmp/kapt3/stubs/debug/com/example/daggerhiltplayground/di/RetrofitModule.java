package com.example.daggerhiltplayground.di;

import com.example.daggerhiltplayground.model.Blog;
import com.example.daggerhiltplayground.network.BlogNetworkEntity;
import com.example.daggerhiltplayground.network.BlogRetrofit;
import com.example.daggerhiltplayground.network.NetworkMapper;
import com.example.daggerhiltplayground.util.EntityMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/daggerhiltplayground/di/RetrofitModule;", "", "()V", "provideBlogService", "Lcom/example/daggerhiltplayground/network/BlogRetrofit;", "retrofit", "Lretrofit2/Retrofit$Builder;", "provideGsonBuilder", "Lcom/google/gson/Gson;", "provideRetrofit", "gson", "app_debug"})
@dagger.Module()
public final class RetrofitModule {
    public static final com.example.daggerhiltplayground.di.RetrofitModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGsonBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.daggerhiltplayground.network.BlogRetrofit provideBlogService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofit) {
        return null;
    }
    
    private RetrofitModule() {
        super();
    }
}