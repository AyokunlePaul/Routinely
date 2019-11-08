package com.ayokunlepaul.local.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/ayokunlepaul/local/mappers/LocalModelMapper;", "LOCAL", "REPOSITORY", "", "mapToRepository", "local", "(Ljava/lang/Object;)Ljava/lang/Object;", "mapToRepositoryList", "", "(Ljava/lang/Object;)Ljava/util/List;", "local_debug"})
public abstract interface LocalModelMapper<LOCAL extends java.lang.Object, REPOSITORY extends java.lang.Object> {
    
    public abstract REPOSITORY mapToRepository(LOCAL local);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<REPOSITORY> mapToRepositoryList(LOCAL local);
}