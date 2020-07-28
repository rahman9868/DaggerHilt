package com.example.daggerhiltplayground.network;

import com.example.daggerhiltplayground.model.Blog;
import com.example.daggerhiltplayground.util.EntityMapper;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/example/daggerhiltplayground/network/NetworkMapper;", "Lcom/example/daggerhiltplayground/util/EntityMapper;", "Lcom/example/daggerhiltplayground/network/BlogNetworkEntity;", "Lcom/example/daggerhiltplayground/model/Blog;", "()V", "mapFromEntity", "entity", "mapFromEntityList", "", "entities", "mapToEntity", "domainModel", "app_debug"})
public final class NetworkMapper implements com.example.daggerhiltplayground.util.EntityMapper<com.example.daggerhiltplayground.network.BlogNetworkEntity, com.example.daggerhiltplayground.model.Blog> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.daggerhiltplayground.model.Blog mapFromEntity(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.network.BlogNetworkEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.daggerhiltplayground.network.BlogNetworkEntity mapToEntity(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltplayground.model.Blog domainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.daggerhiltplayground.model.Blog> mapFromEntityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.daggerhiltplayground.network.BlogNetworkEntity> entities) {
        return null;
    }
    
    @javax.inject.Inject()
    public NetworkMapper() {
        super();
    }
}