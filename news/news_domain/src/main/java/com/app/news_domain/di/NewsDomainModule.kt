package com.app.news_domain.di

import com.app.news_domain.repository.NewsRepository
import com.app.news_domain.use_case.GetNewsArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object NewsDomainModule {

    @Provides
    fun provideGetNewsUseCase(newsRepository: NewsRepository): GetNewsArticleUseCase {
        return GetNewsArticleUseCase(newsRepository)
    }

}