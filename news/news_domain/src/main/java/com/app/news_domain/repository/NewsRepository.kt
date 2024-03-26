package com.app.news_domain.repository

import com.app.news_domain.model.Article

interface NewsRepository {

    suspend fun getNewsArticle(): List<Article>
}