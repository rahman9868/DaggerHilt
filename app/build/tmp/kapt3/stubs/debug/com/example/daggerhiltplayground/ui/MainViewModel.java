package com.example.daggerhiltplayground.ui;

import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import com.example.daggerhiltplayground.model.Blog;
import com.example.daggerhiltplayground.repository.MainRepository;
import com.example.daggerhiltplayground.util.DataState;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/daggerhiltplayground/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/daggerhiltplayground/repository/MainRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/daggerhiltplayground/repository/MainRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_dataState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/daggerhiltplayground/util/DataState;", "", "Lcom/example/daggerhiltplayground/model/Blog;", "dataState", "Landroidx/lifecycle/LiveData;", "getDataState", "()Landroidx/lifecycle/LiveData;", "setStateEvent", "", "mainStateEvent", "Lcom/example/daggerhiltplayground/ui/MainStateEvent;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.daggerhiltplayground.util.DataState<java.util.List<com.example.daggerhiltplayground.model.Blog>>> _dataState = null;
    private final com.example.daggerhiltplayground.repository.MainRepository mainRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.daggerhiltplayground.util.DataState<java.util.List<com.example.daggerhiltplayground.model.Blog>>> getDataState() {
        return null;
    }
    
    public final void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.ui.MainStateEvent mainStateEvent) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.repository.MainRepository mainRepository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}