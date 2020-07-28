package com.example.daggerhiltplayground.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import com.example.daggerhiltplayground.R;
import com.example.daggerhiltplayground.model.Blog;
import com.example.daggerhiltplayground.util.DataState;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.activity_main.*;
import java.lang.StringBuilder;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/daggerhiltplayground/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "viewModel", "Lcom/example/daggerhiltplayground/ui/MainViewModel;", "getViewModel", "()Lcom/example/daggerhiltplayground/ui/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "appendBlogTitles", "", "blogs", "", "Lcom/example/daggerhiltplayground/model/Blog;", "displayError", "message", "displayProgressBar", "isDisplay", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subscribeObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String TAG = "AppDebug";
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.daggerhiltplayground.ui.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeObservers() {
    }
    
    private final void displayError(java.lang.String message) {
    }
    
    private final void displayProgressBar(boolean isDisplay) {
    }
    
    private final void appendBlogTitles(java.util.List<com.example.daggerhiltplayground.model.Blog> blogs) {
    }
    
    public MainActivity() {
        super();
    }
}