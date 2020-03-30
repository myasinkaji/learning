package ir.mtyn.learning.generic.resolve.p1.dao;

import ir.mtyn.learning.generic.resolve.p1.dao.entity.BaseEntity;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Dao<T extends BaseEntity> {

    void save(T entity);
}
