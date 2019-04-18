package com.hui.springdemo.service.serveimp;

import com.hui.springdemo.model.ArticReposity;
import com.hui.springdemo.model.Article;
import com.hui.springdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService {
    @Autowired
    private ArticReposity articReposity;
    @Override
    public Article saveArticle(Article article) {
        return articReposity.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return articReposity.save(article);
    }

    @Override
    public Article findArticle(long id) {
        return articReposity.findByid(id);
    }

    @Override
    public void delete(Article article) {

    }
}
