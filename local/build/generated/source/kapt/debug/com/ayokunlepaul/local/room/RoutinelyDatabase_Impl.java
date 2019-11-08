package com.ayokunlepaul.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.ayokunlepaul.local.room.daos.RoutineDAO;
import com.ayokunlepaul.local.room.daos.RoutineDAO_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoutinelyDatabase_Impl extends RoutinelyDatabase {
  private volatile RoutineDAO _routineDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RoutineLocalModel` (`routineId` TEXT NOT NULL, `timeCreated` INTEGER NOT NULL, `routineTitle` TEXT, `routineDescription` TEXT, `routineFrequency` INTEGER NOT NULL, `routineState` INTEGER NOT NULL, `totalMissedRoutines` INTEGER NOT NULL, `totalCompletedRoutine` INTEGER NOT NULL, PRIMARY KEY(`routineId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '131cc5a356723d68066e05eeb8865e6e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `RoutineLocalModel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRoutineLocalModel = new HashMap<String, TableInfo.Column>(8);
        _columnsRoutineLocalModel.put("routineId", new TableInfo.Column("routineId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("timeCreated", new TableInfo.Column("timeCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("routineTitle", new TableInfo.Column("routineTitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("routineDescription", new TableInfo.Column("routineDescription", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("routineFrequency", new TableInfo.Column("routineFrequency", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("routineState", new TableInfo.Column("routineState", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("totalMissedRoutines", new TableInfo.Column("totalMissedRoutines", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoutineLocalModel.put("totalCompletedRoutine", new TableInfo.Column("totalCompletedRoutine", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoutineLocalModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoutineLocalModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoutineLocalModel = new TableInfo("RoutineLocalModel", _columnsRoutineLocalModel, _foreignKeysRoutineLocalModel, _indicesRoutineLocalModel);
        final TableInfo _existingRoutineLocalModel = TableInfo.read(_db, "RoutineLocalModel");
        if (! _infoRoutineLocalModel.equals(_existingRoutineLocalModel)) {
          return new RoomOpenHelper.ValidationResult(false, "RoutineLocalModel(com.ayokunlepaul.local.models.RoutineLocalModel).\n"
                  + " Expected:\n" + _infoRoutineLocalModel + "\n"
                  + " Found:\n" + _existingRoutineLocalModel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "131cc5a356723d68066e05eeb8865e6e", "3e30aab9cacbfc8d2a77edbdff305176");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "RoutineLocalModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `RoutineLocalModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RoutineDAO getRoutineDAO() {
    if (_routineDAO != null) {
      return _routineDAO;
    } else {
      synchronized(this) {
        if(_routineDAO == null) {
          _routineDAO = new RoutineDAO_Impl(this);
        }
        return _routineDAO;
      }
    }
  }
}
