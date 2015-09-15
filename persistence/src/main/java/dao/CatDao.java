package dao;

import model.Cat;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.*;
import java.util.List;

/**
 * Created by root on 9/11/15.
 */
public class CatDao implements ICatDao{

    private EntityManager entityManager;

    @PersistenceContext
    private void setEntityManager(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public List<Cat> getAll(){
        return this.entityManager.createQuery("from Cat").getResultList();
    }
}
