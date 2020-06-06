package iunsuccessful.demo.kotlin.dao

import iunsuccessful.demo.kotlin.entity.Article
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

/**
 * 依韵 2020/6/6
 */
@Mapper
@Repository
interface ArticleDao {

    fun getById(id:Long): Article
}