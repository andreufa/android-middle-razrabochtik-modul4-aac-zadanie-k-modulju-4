package com.yandex.practicum.middle_homework_4.ui.contract

import com.yandex.practicum.middle_homework_4.data.news_service.NewsResponse

interface NewsService {
    fun fetchData(page: Int): NewsResponse
}