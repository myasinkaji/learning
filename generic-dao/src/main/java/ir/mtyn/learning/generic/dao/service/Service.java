package ir.mtyn.learning.generic.dao.service;

import ir.mtyn.learning.generic.dao.dao.BaseEntity;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Service<ID extends Number, T extends BaseEntity<ID>> {

    T byId(ID id);

    T needType(T entity);

    T needlessType(T entity);
}
