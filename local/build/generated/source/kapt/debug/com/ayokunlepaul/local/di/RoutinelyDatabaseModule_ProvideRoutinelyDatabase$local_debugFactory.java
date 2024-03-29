// Generated by Dagger (https://dagger.dev).
package com.ayokunlepaul.local.di;

import android.content.Context;
import com.ayokunlepaul.local.room.RoutinelyDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoutinelyDatabaseModule_ProvideRoutinelyDatabase$local_debugFactory implements Factory<RoutinelyDatabase> {
  private final RoutinelyDatabaseModule module;

  private final Provider<Context> contextProvider;

  public RoutinelyDatabaseModule_ProvideRoutinelyDatabase$local_debugFactory(
      RoutinelyDatabaseModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public RoutinelyDatabase get() {
    return provideRoutinelyDatabase$local_debug(module, contextProvider.get());
  }

  public static RoutinelyDatabaseModule_ProvideRoutinelyDatabase$local_debugFactory create(
      RoutinelyDatabaseModule module, Provider<Context> contextProvider) {
    return new RoutinelyDatabaseModule_ProvideRoutinelyDatabase$local_debugFactory(module, contextProvider);
  }

  public static RoutinelyDatabase provideRoutinelyDatabase$local_debug(
      RoutinelyDatabaseModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideRoutinelyDatabase$local_debug(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
