package com.app.news_data.repository

import com.app.news_data.mapper.toDomainArticle
import com.app.news_data.network.NewsApiService
import com.app.news_data.room.NewsDao
import com.app.news_domain.model.Article
import com.app.news_domain.repository.NewsRepository

class NewsRepoImpl(private val newsApiService: NewsApiService,private val newsDao: NewsDao) : NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return try {
            val temp = newsApiService.getNewsArticles().articles.map { it.toDomainArticle() }
            newsDao.insertList(temp)
            newsDao.getNewsArticle()
        }catch (e:Exception){
            newsDao.getNewsArticle()
        }
    }
}