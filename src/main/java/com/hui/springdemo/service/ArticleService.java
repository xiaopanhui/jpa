package com.hui.springdemo.service;

import com.hui.springdemo.model.Article;

public interface ArticleService {
    Article saveArticle( Article article);
    Article updateArticle( Article article);

    Article findArticle(long id);
    void delete( Article article);

}
