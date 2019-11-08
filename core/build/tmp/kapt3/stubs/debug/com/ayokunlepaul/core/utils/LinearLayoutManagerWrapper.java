package com.ayokunlepaul.core.utils;

import java.lang.System;

/**
 * Created by ayokunlepaul on 20/03/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/ayokunlepaul/core/utils/LinearLayoutManagerWrapper;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "supportsPredictiveItemAnimations", "", "core_debug"})
public final class LinearLayoutManagerWrapper extends androidx.recyclerview.widget.LinearLayoutManager {
    
    @java.lang.Override()
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
    
    public LinearLayoutManagerWrapper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}