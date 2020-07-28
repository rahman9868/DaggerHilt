package com.example.daggerhiltplayground.repository;

import com.example.daggerhiltplayground.model.Blog;
import com.example.daggerhiltplayground.network.BlogRetrofit;
import com.example.daggerhiltplayground.network.NetworkMapper;
import com.example.daggerhiltplayground.room.BlogDao;
import com.example.daggerhiltplayground.room.CacheMapper;
import com.example.daggerhiltplayground.util.DataState;
import kotlinx.coroutines.flow.Flow;
import java.lang.Exception;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/daggerhiltplayground/repository/MainRepository;", "", "blogDao", "Lcom/example/daggerhiltplayground/room/BlogDao;", "blogRetrofit", "Lcom/example/daggerhiltplayground/network/BlogRetrofit;", "cacheMapper", "Lcom/example/daggerhiltplayground/room/CacheMapper;", "networkMapper", "Lcom/example/daggerhiltplayground/network/NetworkMapper;", "(Lcom/example/daggerhiltplayground/room/BlogDao;Lcom/example/daggerhiltplayground/network/BlogRetrofit;Lcom/example/daggerhiltplayground/room/CacheMapper;Lcom/example/daggerhiltplayground/network/NetworkMapper;)V", "getBlog", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/daggerhiltplayground/util/DataState;", "", "Lcom/example/daggerhiltplayground/model/Blog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainRepository {
    private final com.example.daggerhiltplayground.room.BlogDao blogDao = null;
    private final com.example.daggerhiltplayground.network.BlogRetrofit blogRetrofit = null;
    private final com.example.daggerhiltplayground.room.CacheMapper cacheMapper = null;
    private final com.example.daggerhiltplayground.network.NetworkMapper networkMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBlog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.daggerhiltplayground.util.DataState<? extends java.util.List<com.example.daggerhiltplayground.model.Blog>>>> p0) {
        return null;
    }
    
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.room.BlogDao blogDao, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.network.BlogRetrofit blogRetrofit, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.network.NetworkMapper networkMapper) {
        super();
    }
}