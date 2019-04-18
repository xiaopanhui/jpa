package com.hui.springdemo.service.serveimp;

import com.alibaba.fastjson.JSON;
import com.hui.springdemo.model.Article;
import com.hui.springdemo.model.Comment;
import com.hui.springdemo.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ArticleServiceImpTest {
    @Autowired
   private ArticleService articleService;
    @Test
    public void saveArticle() {
        Article article = new Article();
        article.setTitle("biaoti2");
        article.setContent("articleContent2");
        List<Comment> comments = new ArrayList<>();
        Comment comment = new Comment("pL3");
        Comment comment1 = new Comment("PL4");
//        comment.setArticle(article);
//        comment1.setArticle(article);
//        comments.add(comment);
//        comments.add(comment1);
//        article.setComments(comments);
        article.addComment(comment);
        article.addComment(comment1);
        articleService.saveArticle(article);
        System.out.println(JSON.toJSONString(article,true));
    }

    @Test
    public void updateArticle() {
        Article article = articleService.findArticle(2L);
        article.setContent("changeContent");
        articleService.updateArticle(article);
    }

    @Test
    public void findArticle() {
        Article article = articleService.findArticle(2L);
        System.out.println(JSON.toJSONString(article,true));
    }

    @Test
    public void delete() {
    }
}