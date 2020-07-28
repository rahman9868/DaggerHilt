package com.example.daggerhiltplayground.di;

import com.example.daggerhiltplayground.network.BlogRetrofit;
import com.example.daggerhiltplayground.network.NetworkMapper;
import com.example.daggerhiltplayground.repository.MainRepository;
import com.example.daggerhiltplayground.room.BlogDao;
import com.example.daggerhiltplayground.room.CacheMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideMainRepositoryFactory implements Factory<MainRepository> {
  private final Provider<BlogDao> blogDaoProvider;

  private final Provider<BlogRetrofit> retrofitProvider;

  private final Provider<CacheMapper> cacheMapperProvider;

  private final Provider<NetworkMapper> networkMapperProvider;

  public RepositoryModule_ProvideMainRepositoryFactory(Provider<BlogDao> blogDaoProvider,
      Provider<BlogRetrofit> retrofitProvider, Provider<CacheMapper> cacheMapperProvider,
      Provider<NetworkMapper> networkMapperProvider) {
    this.blogDaoProvider = blogDaoProvider;
    this.retrofitProvider = retrofitProvider;
    this.cacheMapperProvider = cacheMapperProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public MainRepository get() {
    return provideMainRepository(blogDaoProvider.get(), retrofitProvider.get(), cacheMapperProvider.get(), networkMapperProvider.get());
  }

  public static RepositoryModule_ProvideMainRepositoryFactory create(
      Provider<BlogDao> blogDaoProvider, Provider<BlogRetrofit> retrofitProvider,
      Provider<CacheMapper> cacheMapperProvider, Provider<NetworkMapper> networkMapperProvider) {
    return new RepositoryModule_ProvideMainRepositoryFactory(blogDaoProvider, retrofitProvider, cacheMapperProvider, networkMapperProvider);
  }

  public static MainRepository provideMainRepository(BlogDao blogDao, BlogRetrofit retrofit,
      CacheMapper cacheMapper, NetworkMapper networkMapper) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideMainRepository(blogDao, retrofit, cacheMapper, networkMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
