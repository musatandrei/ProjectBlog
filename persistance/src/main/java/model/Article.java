package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name="article")
public class Article implements Serializable {
    @Id
    @GeneratedValue(generator = "idIncrementor")
    @GenericGenerator(name="idIncrementor", strategy="increment")
    @Column(name="Id")
    private Long id;
    @Column(name="Title")
    private String title;
    @Column(name="Description")
    private String description;
    @Column(name="Comments")
    private String comments;

    public Article(){}

    public Article(Long id, String title, String description, String comments) {
        id = id;
        title = title;
        description = description;
        comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
