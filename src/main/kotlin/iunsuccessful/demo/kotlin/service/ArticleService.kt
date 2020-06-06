package iunsuccessful.demo.kotlin.service

import iunsuccessful.demo.kotlin.entity.Article

/**
 * 依韵 2020/5/30
 */
interface ArticleService {

    fun getById(id: Long) : Article

}