package dao;

import model.Article;
import model.Comment;

import java.util.List;

/**
 * Created by Andrei on 9/15/2015.
 */
public interface ICommentDao {
    public List<Comment> getAllComments(Long commentId);
    Comment getComment(Long articleId, Long commentId);
    void updateComment(Comment comment);
    void saveComment(Comment comment);
    void deleteComment(Long articleId, Long commentId);

}
