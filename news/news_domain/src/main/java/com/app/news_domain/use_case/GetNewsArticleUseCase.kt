package com.app.news_domain.use_case

import com.app.common_utills.Resource
import com.app.news_domain.model.Article
import com.app.news_domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNewsArticleUseCase(private val newsRepository: NewsRepository) {
    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(newsRepository.getNewsArticle()))
        } catch (e: Exception) {
            emit(Resource.Error(e.message.toString()))
        }
    }
}