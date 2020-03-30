package ir.mtyn.learning.generic.mtynbusinesslayer;

import ir.mtyn.learning.generic.mtynbusinesslayer.dao.BaseEntity;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.Service;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class AbstractService<ID extends Number, T extends BaseEntity<ID>>
        extends Parameterized<T> implements Service<ID, T> {

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

    protected abstract Dao<ID, T> getDao();
}
