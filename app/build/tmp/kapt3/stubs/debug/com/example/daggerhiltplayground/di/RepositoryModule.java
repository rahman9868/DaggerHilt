package com.example.daggerhiltplayground.di;

import com.example.daggerhiltplayground.network.BlogRetrofit;
import com.example.daggerhiltplayground.network.NetworkMapper;
import com.example.daggerhiltplayground.repository.MainRepository;
import com.example.daggerhiltplayground.room.BlogDao;
import com.example.daggerhiltplayground.room.CacheMapper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/daggerhiltplayground/di/RepositoryModule;", "", "()V", "provideMainRepository", "Lcom/example/daggerhiltplayground/repository/MainRepository;", "blogDao", "Lcom/example/daggerhiltplayground/room/BlogDao;", "retrofit", "Lcom/example/daggerhiltplayground/network/BlogRetrofit;", "cacheMapper", "Lcom/example/daggerhiltplayground/room/CacheMapper;", "networkMapper", "Lcom/example/daggerhiltplayground/network/NetworkMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    public static final com.example.daggerhiltplayground.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.daggerhiltplayground.repository.MainRepository provideMainRepository(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.room.BlogDao blogDao, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.network.BlogRetrofit retrofit, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.network.NetworkMapper networkMapper) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}