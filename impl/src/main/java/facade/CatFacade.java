package facade;

import dao.ICatDao;
import model.Cat;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by root on 9/11/15.
 */
public class CatFacade implements ICatFacade{

    @Autowired
    private ICatDao catDao;

    public List<Cat> bringCats(){
        return this.catDao.getAll();
    }

    public ICatDao getCatDao() {
        return catDao;
    }

    public void setCatDao(ICatDao catDao) {
        this.catDao = catDao;
    }
}
