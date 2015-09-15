package dao;

import model.Article;

import java.util.List;

public interface IArticleDao {
    public List<Article> getAll();
    Article getArticle(Long Articleid);
    void updateArticle(Article article);
    void saveArticle(Article article);
    void deleteArticle(Long Articleid);

}
