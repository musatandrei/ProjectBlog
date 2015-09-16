package dao;

import model.Comment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by Andrei on 9/15/2015.
 */
public class CommentDao implements ICommentDao {
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Comment> getAllComments(Long articleId) {
        Query query = this.entityManager.createQuery("from Comment Where articleId=:comId");
        query.setParameter("comId", articleId);
        return query.getResultList();

    }

    @Transactional
    public Comment getComment(Long articleId, Long commentId) {
        Query query = this.entityManager.createQuery("from Comment WHERE articleId=:articleId AND id=:id");
        query.setParameter("articleId", articleId);
        query.setParameter("id", commentId);
        return (Comment) query.getSingleResult();
    }

    @Transactional
    public void saveComment(Comment comment) {
        comment.setDate(new Date());
        this.entityManager.persist(comment);
    }

    @Transactional
    public void updateComment(Comment comment) {

        Comment commentFromDb = this.getComment(comment.getArticleId(), comment.getId());
        if (commentFromDb != null) {
            commentFromDb.setLastedit(new Date());
            commentFromDb.setContent((comment.getContent()));
            this.entityManager.persist(commentFromDb);
        }

    }
    @Transactional
    public void deleteComment(Long articleId, Long commentId){
        Comment commentFromDb = this.getComment(articleId, commentId);
        if(commentFromDb != null)
        {
            this.entityManager.remove(commentFromDb);
        }

    }
}

