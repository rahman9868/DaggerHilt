package com.example.daggerhiltplayground.repository

import com.example.daggerhiltplayground.model.Blog
import com.example.daggerhiltplayground.network.BlogRetrofit
import com.example.daggerhiltplayground.network.NetworkMapper
import com.example.daggerhiltplayground.room.BlogDao
import com.example.daggerhiltplayground.room.CacheMapper
import com.example.daggerhiltplayground.util.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class MainRepository
constructor(
    private val blogDao: BlogDao,
    private val blogRetrofit: BlogRetrofit,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
)
{

    suspend fun getBlog(): Flow<DataState<List<Blog>>> = flow {
        emit(DataState.Loading)
        delay(1000)
        try {
            val networkBlogs = blogRetrofit.get()
            val blogs = networkMapper.mapFromEntityList(networkBlogs)
            for(blog in blogs){
                blogDao.insert(cacheMapper.mapToEntity(blog))
            }

            val cachedBlogs = blogDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cachedBlogs)))

        }catch (e:Exception){
            emit(DataState.Error(e))

        }
    }

}