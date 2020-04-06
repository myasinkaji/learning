package ir.mtyn.learning.generic.dao;

import ir.mtyn.learning.generic.dao.dao.BaseEntity;
import ir.mtyn.learning.generic.dao.service.BaseFilterEntity;
import ir.mtyn.learning.generic.dao.service.FilterableService;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class AbstractFilterableService
        <ID extends Number, T extends BaseEntity<ID>, F extends BaseFilterEntity, DAO extends Dao<ID, T>>
        extends AbstractService<ID, T, DAO>
        implements FilterableService<ID, T, F> {

    public AbstractFilterableService() {
    }

    public AbstractFilterableService(DAO dao) {
        super(dao);
    }
}
