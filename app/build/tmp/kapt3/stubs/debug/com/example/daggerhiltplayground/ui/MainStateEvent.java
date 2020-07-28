package com.example.daggerhiltplayground.ui;

import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import com.example.daggerhiltplayground.model.Blog;
import com.example.daggerhiltplayground.repository.MainRepository;
import com.example.daggerhiltplayground.util.DataState;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/daggerhiltplayground/ui/MainStateEvent;", "", "()V", "GetBlogEvents", "None", "Lcom/example/daggerhiltplayground/ui/MainStateEvent$GetBlogEvents;", "Lcom/example/daggerhiltplayground/ui/MainStateEvent$None;", "app_debug"})
public abstract class MainStateEvent {
    
    private MainStateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/daggerhiltplayground/ui/MainStateEvent$GetBlogEvents;", "Lcom/example/daggerhiltplayground/ui/MainStateEvent;", "()V", "app_debug"})
    public static final class GetBlogEvents extends com.example.daggerhiltplayground.ui.MainStateEvent {
        public static final com.example.daggerhiltplayground.ui.MainStateEvent.GetBlogEvents INSTANCE = null;
        
        private GetBlogEvents() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/daggerhiltplayground/ui/MainStateEvent$None;", "Lcom/example/daggerhiltplayground/ui/MainStateEvent;", "()V", "app_debug"})
    public static final class None extends com.example.daggerhiltplayground.ui.MainStateEvent {
        public static final com.example.daggerhiltplayground.ui.MainStateEvent.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
}