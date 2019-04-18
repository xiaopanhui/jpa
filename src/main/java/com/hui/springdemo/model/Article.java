package com.hui.springdemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
/**
 * 少的为关系被维护方
 */
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String title;
    private String content;
    @OneToMany(mappedBy = "article",cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE},fetch = FetchType.EAGER)
//    private List<Comment> comments;
    private List<Comment> comments=new ArrayList<>();
//    Comment comment1 = new Comment("PL2");
//        comment.setArticle(article);
//

    public void addComment(Comment comment){
        comment.setArticle(this);
        comments.add(comment);
    }

}
