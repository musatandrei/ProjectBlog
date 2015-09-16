package com.service;
import facade.ArticleFacade;
import facade.IArticleFacade;
import model.Article;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/article")
public class ArticleService {

    @Autowired

    private IArticleFacade articleFacade;
    @DateTimeFormat
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Article> getAllArticles(){
        return this.articleFacade.bringArticle();

    }

    public IArticleFacade getArticleFacade() {
        return articleFacade;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Article getArticle(@PathVariable("id") Long Articleid){

        return this.articleFacade.getArticle(Articleid);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody

    public void  deleteArticle(@PathVariable("id") Long articleId) {
       this.articleFacade.deleteArticle(articleId);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void addArticle(@RequestBody Article newArticle) {

        this.articleFacade.saveArticle(newArticle);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateArticle(@PathVariable("id") Long articleId, @RequestBody Article articleUpdates){
        articleUpdates.setId(articleId);
        this.articleFacade.updateArticle(articleUpdates);
    }



    public void setArticleFacade(IArticleFacade articleFacade) {
        this.articleFacade = articleFacade;
    }
}
