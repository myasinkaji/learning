package ir.mtyn.learning.generic.mtynbusinesslayer.service;

import ir.mtyn.learning.generic.mtynbusinesslayer.dao.BaseEntity;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface FilterableService
        <ID extends Number, T extends BaseEntity<ID>, F extends BaseFilterEntity>
        extends Service<ID, T>, Filterable<F> {
}
