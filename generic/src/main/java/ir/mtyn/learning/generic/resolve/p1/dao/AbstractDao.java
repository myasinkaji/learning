package ir.mtyn.learning.generic.resolve.p1.dao;

import ir.mtyn.learning.generic.resolve.p1.dao.entity.BaseEntity;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class AbstractDao<T extends BaseEntity> implements Dao<T> {

    protected Class<T> firstParamType;

    public AbstractDao() {
        firstParamType = (Class<T>)
                ((ParameterizedTypeImpl) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    }

    @Override
    public void save(T entity) {
        System.out.println("save...");
    }
}
