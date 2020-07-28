package com.example.daggerhiltplayground.di;

import android.content.Context;
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
public final class RoomModule_ProvidesBlogDbFactory implements Factory<BlogDatabase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvidesBlogDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public BlogDatabase get() {
    return providesBlogDb(contextProvider.get());
  }

  public static RoomModule_ProvidesBlogDbFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvidesBlogDbFactory(contextProvider);
  }

  public static BlogDatabase providesBlogDb(Context context) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.providesBlogDb(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
