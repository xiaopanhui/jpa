package com.hui.springdemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
/**
 * many为关系的维护方
 */
public class Comment {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    //正文
    private  String content;
    @ManyToOne
    //many 为关系的维护方
    private  Article article;

    public Comment(String content) {
        this.content = content;
    }
    public Comment() {

    }
}
