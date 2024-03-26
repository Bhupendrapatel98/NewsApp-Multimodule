package com.app.news_data.repository

import com.app.news_data.mapper.toDomainArticle
import com.app.news_data.network.NewsApiService
import com.app.news_domain.model.Article
import com.app.news_domain.repository.NewsRepository

class NewsRepoImpl(private val newsApiService: NewsApiService) : NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return newsApiService.getNewsArticles().articles.map { it.toDomainArticle() }
    }
}