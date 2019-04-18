package com.hui.springdemo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ArticReposity extends JpaRepository<Article,Long> {
    @Query("select a from  Article  a where id=:id")
   public Article findByid(@Param("id") Long id);
}
