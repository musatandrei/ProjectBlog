package model;

import javax.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Andrei on 9/15/2015.
 */
@Entity
@Table(name="comment")


public class Comment {

    @Id
    @GeneratedValue(generator="idIncrementor")
    @GenericGenerator(name="idIncrementor" , strategy="increment")
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "articleId")
    private Long articleId;

    public Comment(){};

    public Comment(String content, Long articleId) {
        this.content = content;
        this.articleId = articleId;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}

