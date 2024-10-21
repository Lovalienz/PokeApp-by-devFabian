package com.poke.pokeapp.di

import com.poke.pokeapp.core.Config
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Config.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}