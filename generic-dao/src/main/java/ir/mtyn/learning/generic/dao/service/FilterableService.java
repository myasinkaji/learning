package ir.mtyn.learning.generic.dao.service;

import ir.mtyn.learning.generic.dao.dao.BaseEntity;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface FilterableService
        <ID extends Number, T extends BaseEntity<ID>, F extends BaseFilterEntity>
        extends Service<ID, T>, Filterable<F> {
}
