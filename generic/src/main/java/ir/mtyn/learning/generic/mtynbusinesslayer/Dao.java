package ir.mtyn.learning.generic.mtynbusinesslayer;

import ir.mtyn.learning.generic.mtynbusinesslayer.dao.BaseEntity;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Dao<ID extends Number, T extends BaseEntity<ID>> extends Parameterized<T> {

    private Object entityManager;

    protected T byId(ID id) {
        return null;
    }

    //This is called by child or abstractService(generalService)
    protected T needType(T entity) {
        return this.needType(entity, getClazz());
    }

    //This is called by AbstractService(generalService) only
    T needType(T entity, Class<T> clazz) {
        return null;
    }

    protected T needlessType(T entity) {
        return null;
    }
}
