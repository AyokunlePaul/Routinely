// Generated by Dagger (https://dagger.dev).
package com.ayokunlepaul.local.di;

import com.ayokunlepaul.local.room.RoutinelyDatabase;
import com.ayokunlepaul.local.room.daos.RoutineDAO;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoutinelyDatabaseModule_ProvideRoutineDAO$local_debugFactory implements Factory<RoutineDAO> {
  private final RoutinelyDatabaseModule module;

  private final Provider<RoutinelyDatabase> databaseProvider;

  public RoutinelyDatabaseModule_ProvideRoutineDAO$local_debugFactory(
      RoutinelyDatabaseModule module, Provider<RoutinelyDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RoutineDAO get() {
    return provideRoutineDAO$local_debug(module, databaseProvider.get());
  }

  public static RoutinelyDatabaseModule_ProvideRoutineDAO$local_debugFactory create(
      RoutinelyDatabaseModule module, Provider<RoutinelyDatabase> databaseProvider) {
    return new RoutinelyDatabaseModule_ProvideRoutineDAO$local_debugFactory(module, databaseProvider);
  }

  public static RoutineDAO provideRoutineDAO$local_debug(RoutinelyDatabaseModule instance,
      RoutinelyDatabase database) {
    return Preconditions.checkNotNull(instance.provideRoutineDAO$local_debug(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
