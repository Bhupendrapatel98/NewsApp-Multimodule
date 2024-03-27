package com.app.newsappapplication

import android.content.Context
import com.app.common_utills.Navigator
import com.app.news_data.room.NewsDao
import com.app.newsappapplication.navigation.DefaultNavigator
import com.app.newsappapplication.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainModule {

    @Provides
    @Singleton
    fun provideProvider(): Navigator.Provider {
        return DefaultNavigator()
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context):AppDatabase{
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideNewsDao(appDatabase: AppDatabase) : NewsDao{
        return appDatabase.getNewsDao()
    }
}