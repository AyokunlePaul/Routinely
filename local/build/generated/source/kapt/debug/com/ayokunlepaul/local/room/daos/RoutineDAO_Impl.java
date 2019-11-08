package com.ayokunlepaul.local.room.daos;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ayokunlepaul.local.models.RoutineLocalModel;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoutineDAO_Impl implements RoutineDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoutineLocalModel> __insertionAdapterOfRoutineLocalModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRoutineWithId;

  public RoutineDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoutineLocalModel = new EntityInsertionAdapter<RoutineLocalModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RoutineLocalModel` (`routineId`,`timeCreated`,`routineTitle`,`routineDescription`,`routineFrequency`,`routineState`,`totalMissedRoutines`,`totalCompletedRoutine`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoutineLocalModel value) {
        if (value.getRoutineId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getRoutineId());
        }
        stmt.bindLong(2, value.getTimeCreated());
        if (value.getRoutineTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRoutineTitle());
        }
        if (value.getRoutineDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRoutineDescription());
        }
        stmt.bindLong(5, value.getRoutineFrequency());
        stmt.bindLong(6, value.getRoutineState());
        stmt.bindLong(7, value.getTotalMissedRoutines());
        stmt.bindLong(8, value.getTotalCompletedRoutine());
      }
    };
    this.__preparedStmtOfDeleteRoutineWithId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RoutineLocalModel WHERE routineId = ?";
        return _query;
      }
    };
  }

  @Override
  public Completable saveRoutine(final RoutineLocalModel routineLocalModel) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoutineLocalModel.insert(routineLocalModel);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void deleteRoutineWithId(final String routineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRoutineWithId.acquire();
    int _argIndex = 1;
    if (routineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, routineId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRoutineWithId.release(_stmt);
    }
  }

  @Override
  public Observable<List<RoutineLocalModel>> getAllRoutines() {
    final String _sql = "SELECT * FROM RoutineLocalModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, false, new String[]{"RoutineLocalModel"}, new Callable<List<RoutineLocalModel>>() {
      @Override
      public List<RoutineLocalModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfRoutineId = CursorUtil.getColumnIndexOrThrow(_cursor, "routineId");
          final int _cursorIndexOfTimeCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "timeCreated");
          final int _cursorIndexOfRoutineTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "routineTitle");
          final int _cursorIndexOfRoutineDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "routineDescription");
          final int _cursorIndexOfRoutineFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "routineFrequency");
          final int _cursorIndexOfRoutineState = CursorUtil.getColumnIndexOrThrow(_cursor, "routineState");
          final int _cursorIndexOfTotalMissedRoutines = CursorUtil.getColumnIndexOrThrow(_cursor, "totalMissedRoutines");
          final int _cursorIndexOfTotalCompletedRoutine = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCompletedRoutine");
          final List<RoutineLocalModel> _result = new ArrayList<RoutineLocalModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RoutineLocalModel _item;
            final String _tmpRoutineId;
            _tmpRoutineId = _cursor.getString(_cursorIndexOfRoutineId);
            final long _tmpTimeCreated;
            _tmpTimeCreated = _cursor.getLong(_cursorIndexOfTimeCreated);
            final String _tmpRoutineTitle;
            _tmpRoutineTitle = _cursor.getString(_cursorIndexOfRoutineTitle);
            final String _tmpRoutineDescription;
            _tmpRoutineDescription = _cursor.getString(_cursorIndexOfRoutineDescription);
            final int _tmpRoutineFrequency;
            _tmpRoutineFrequency = _cursor.getInt(_cursorIndexOfRoutineFrequency);
            final int _tmpRoutineState;
            _tmpRoutineState = _cursor.getInt(_cursorIndexOfRoutineState);
            final int _tmpTotalMissedRoutines;
            _tmpTotalMissedRoutines = _cursor.getInt(_cursorIndexOfTotalMissedRoutines);
            final int _tmpTotalCompletedRoutine;
            _tmpTotalCompletedRoutine = _cursor.getInt(_cursorIndexOfTotalCompletedRoutine);
            _item = new RoutineLocalModel(_tmpRoutineId,_tmpTimeCreated,_tmpRoutineTitle,_tmpRoutineDescription,_tmpRoutineFrequency,_tmpRoutineState,_tmpTotalMissedRoutines,_tmpTotalCompletedRoutine);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
