package com.example.daggerhiltplayground.di;

import com.example.daggerhiltplayground.room.BlogDao;
import com.example.daggerhiltplayground.room.BlogDatabase;
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
public final class RoomModule_ProvideBlogDAOFactory implements Factory<BlogDao> {
  private final Provider<BlogDatabase> blogDatabaseProvider;

  public RoomModule_ProvideBlogDAOFactory(Provider<BlogDatabase> blogDatabaseProvider) {
    this.blogDatabaseProvider = blogDatabaseProvider;
  }

  @Override
  public BlogDao get() {
    return provideBlogDAO(blogDatabaseProvider.get());
  }

  public static RoomModule_ProvideBlogDAOFactory create(
      Provider<BlogDatabase> blogDatabaseProvider) {
    return new RoomModule_ProvideBlogDAOFactory(blogDatabaseProvider);
  }

  public static BlogDao provideBlogDAO(BlogDatabase blogDatabase) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.provideBlogDAO(blogDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
