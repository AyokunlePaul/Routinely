package com.ayokunlepaul.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J*\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000eR\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/ayokunlepaul/core/base/BaseActivity;", "BINDING", "Landroidx/databinding/ViewDataBinding;", "VIEWMODEL", "Lcom/ayokunlepaul/core/base/BaseViewModel;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "bindingVariable", "", "getBindingVariable", "()I", "layoutId", "getLayoutId", "viewModel", "getViewModel", "()Lcom/ayokunlepaul/core/base/BaseViewModel;", "hideKeyboard", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showSnackBar", "rootView", "Landroid/view/View;", "text", "", "isError", "", "duration", "core_debug"})
public abstract class BaseActivity<BINDING extends androidx.databinding.ViewDataBinding, VIEWMODEL extends com.ayokunlepaul.core.base.BaseViewModel> extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    protected BINDING binding;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getLayoutId();
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract VIEWMODEL getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final BINDING getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    BINDING p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void hideKeyboard() {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean isError, int duration) {
    }
    
    public BaseActivity() {
        super();
    }
}