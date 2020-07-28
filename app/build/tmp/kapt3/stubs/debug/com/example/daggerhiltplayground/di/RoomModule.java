package com.example.daggerhiltplayground.di;

import android.content.Context;
import androidx.room.Room;
import com.example.daggerhiltplayground.room.BlogDao;
import com.example.daggerhiltplayground.room.BlogDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/daggerhiltplayground/di/RoomModule;", "", "()V", "provideBlogDAO", "Lcom/example/daggerhiltplayground/room/BlogDao;", "blogDatabase", "Lcom/example/daggerhiltplayground/room/BlogDatabase;", "providesBlogDb", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class RoomModule {
    public static final com.example.daggerhiltplayground.di.RoomModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.daggerhiltplayground.room.BlogDatabase providesBlogDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.daggerhiltplayground.room.BlogDao provideBlogDAO(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.room.BlogDatabase blogDatabase) {
        return null;
    }
    
    private RoomModule() {
        super();
    }
}