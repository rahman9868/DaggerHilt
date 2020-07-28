package com.example.daggerhiltplayground.di

import com.example.daggerhiltplayground.network.BlogRetrofit
import com.example.daggerhiltplayground.network.NetworkMapper
import com.example.daggerhiltplayground.repository.MainRepository
import com.example.daggerhiltplayground.room.BlogDao
import com.example.daggerhiltplayground.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        retrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ) : MainRepository{
        return MainRepository(blogDao, retrofit, cacheMapper, networkMapper)
    }
}