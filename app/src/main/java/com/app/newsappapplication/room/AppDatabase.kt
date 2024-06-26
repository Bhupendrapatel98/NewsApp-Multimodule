package com.app.newsappapplication.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.app.news_data.room.NewsDao
import com.app.news_domain.model.Article

@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class AppDatabase :RoomDatabase() {
    companion object{
        fun getInstance(context: Context):AppDatabase{
            return Room.databaseBuilder(context,AppDatabase::class.java,"app_db")
                .fallbackToDestructiveMigration().build()
        }
    }

    abstract fun getNewsDao() : NewsDao
}