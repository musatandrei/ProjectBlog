package facade;


import dao.IArticleDao;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleFacade implements IArticleFacade{
    @Autowired
    private IArticleDao articleDao;

    public List<Article> bringArticle(){

        return this.articleDao.getAll();
    }
    public Article getArticle(Long articleId){
       return  this.articleDao.getArticle(articleId);
    }
    public void updateArticle(Article article){
        this.articleDao.updateArticle(article);
    }
    public void saveArticle(Article article){
        this.articleDao.saveArticle(article);
    }
    public void deleteArticle(Long articleId){
        this.articleDao.deleteArticle(articleId);
    }


    public IArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(IArticleDao articleDao) {
        this.articleDao = articleDao;
    }


}
