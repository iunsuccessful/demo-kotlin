package iunsuccessful.demo.kotlin.controller

import iunsuccessful.demo.kotlin.entity.Article
import iunsuccessful.demo.kotlin.service.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * 依韵 2020/5/30
 */
@Controller
class HtmlController(@Autowired var articleService: ArticleService) {

    @GetMapping("/{id}")
    fun blog(model: Model, @PathVariable id:Long): String {
        val article: Article = articleService.getById(id)
        model["title"] = article.title;
        return "blog"
    }

}