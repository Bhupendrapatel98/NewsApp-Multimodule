package com.app.news_data.mapper

import com.app.news_data.model.ArticleDTO
import com.app.news_domain.model.Article

fun ArticleDTO.toDomainArticle():Article{
    return Article(
        author = this.author,
        content = this.content,
        description = this.description,
        title = this.title,
        urlToImage = this.urlToImage
    )
}