package model;

import javax.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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
    @Column(name = "date")
    private Date date;
    @Column(name="lastedit")
    private Date lastedit;

    public Comment(){}

    public Comment(String content, Long articleId, Date date, Date lastedit) {
        this.content = content;
        this.articleId = articleId;
        this.date = date;
        this.lastedit = lastedit;
    }

    public Date getLastedit() {

        return lastedit;
    }

    public void setLastedit(Date lastedit) {
        this.lastedit = lastedit;
    }


    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

