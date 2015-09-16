package model;

import org.dom4j.Entity;
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

    @Column(name = "commentId")
    private Long commentId;

    public Comment(){};

    public Comment(String content, Long commentId) {
        this.content = content;
        this.commentId = commentId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

