package com.ayokunlepaul.local.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u00a2\u0006\u0002\u0010\rJ\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J]\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\tH\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018\u00a8\u00064"}, d2 = {"Lcom/ayokunlepaul/local/models/RoutineLocalModel;", "", "routineId", "", "timeCreated", "", "routineTitle", "routineDescription", "routineFrequency", "", "routineState", "totalMissedRoutines", "totalCompletedRoutine", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIII)V", "expiryTime", "getExpiryTime", "()Ljava/lang/Long;", "getRoutineDescription", "()Ljava/lang/String;", "setRoutineDescription", "(Ljava/lang/String;)V", "getRoutineFrequency", "()I", "setRoutineFrequency", "(I)V", "getRoutineId", "getRoutineState", "setRoutineState", "getRoutineTitle", "setRoutineTitle", "getTimeCreated", "()J", "setTimeCreated", "(J)V", "getTotalCompletedRoutine", "setTotalCompletedRoutine", "getTotalMissedRoutines", "setTotalMissedRoutines", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "local_debug"})
public final class RoutineLocalModel {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String routineId = null;
    private long timeCreated;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String routineTitle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String routineDescription;
    private int routineFrequency;
    private int routineState;
    private int totalMissedRoutines;
    private int totalCompletedRoutine;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getExpiryTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoutineId() {
        return null;
    }
    
    public final long getTimeCreated() {
        return 0L;
    }
    
    public final void setTimeCreated(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRoutineTitle() {
        return null;
    }
    
    public final void setRoutineTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRoutineDescription() {
        return null;
    }
    
    public final void setRoutineDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getRoutineFrequency() {
        return 0;
    }
    
    public final void setRoutineFrequency(int p0) {
    }
    
    public final int getRoutineState() {
        return 0;
    }
    
    public final void setRoutineState(int p0) {
    }
    
    public final int getTotalMissedRoutines() {
        return 0;
    }
    
    public final void setTotalMissedRoutines(int p0) {
    }
    
    public final int getTotalCompletedRoutine() {
        return 0;
    }
    
    public final void setTotalCompletedRoutine(int p0) {
    }
    
    public RoutineLocalModel(@org.jetbrains.annotations.NotNull()
    java.lang.String routineId, long timeCreated, @org.jetbrains.annotations.Nullable()
    java.lang.String routineTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String routineDescription, int routineFrequency, int routineState, int totalMissedRoutines, int totalCompletedRoutine) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ayokunlepaul.local.models.RoutineLocalModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String routineId, long timeCreated, @org.jetbrains.annotations.Nullable()
    java.lang.String routineTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String routineDescription, int routineFrequency, int routineState, int totalMissedRoutines, int totalCompletedRoutine) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}