package com.summerproposal.di

import com.google.gson.GsonBuilder
import com.summerproposal.network.PeacockApi
import com.summerproposal.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providePeacockService() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }

    @Singleton
    @Provides
    fun providePeacockAPI(retrofit: Retrofit) : PeacockApi {
        return retrofit.create(PeacockApi::class.java)
    }

}