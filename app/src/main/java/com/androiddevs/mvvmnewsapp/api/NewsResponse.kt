package com.androiddevs.mvvmnewsapp.api


import com.androiddevs.mvvmnewsapp.api.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)