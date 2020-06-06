package iunsuccessful.demo.kotlin.service.impl

import iunsuccessful.demo.kotlin.dao.ArticleDao
import iunsuccessful.demo.kotlin.entity.Article
import iunsuccessful.demo.kotlin.service.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 依韵 2020/5/30
 */
@Service
class ArticleServiceImpl(@Autowired var articleDao: ArticleDao): ArticleService {

    override fun getById(id: Long) : Article {
//        var article = Article("测试")
        return articleDao.getById(id)
    }
}