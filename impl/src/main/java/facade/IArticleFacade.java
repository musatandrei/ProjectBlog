package facade;


import model.Article;

import java.util.List;

public interface IArticleFacade  {

    public List<Article> bringArticle();

    Article getArticle(Long Articleid);
    void updateArticle(Article article);
    void saveArticle(Article article);
    void deleteArticle(Long Articleid);

}
