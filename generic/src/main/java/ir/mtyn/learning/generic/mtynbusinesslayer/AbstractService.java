package ir.mtyn.learning.generic.mtynbusinesslayer;

import ir.mtyn.learning.generic.mtynbusinesslayer.dao.BaseEntity;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.Service;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class AbstractService<ID extends Number, T extends BaseEntity<ID>, DAO extends Dao<ID, T>>
        extends Parameterized<T> implements Service<ID, T> {

    private DAO dao;

    public AbstractService() {
        dao = (DAO) new Dao();//getting from spring context
    }

    public AbstractService(DAO dao) {
        this.dao = dao;
    }

    @Override
    public T byId(ID id) {
        return getDao().byId(id);
    }

    @Override
    public T needType(T entity) {
        return getDao().needType(entity, getClazz());
    }

    @Override
    public T needlessType(T entity) {
        return getDao().needlessType(entity);
    }


    protected final DAO getDao() {
        return dao;
    }
}
