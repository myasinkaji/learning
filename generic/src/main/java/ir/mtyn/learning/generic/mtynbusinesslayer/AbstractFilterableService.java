package ir.mtyn.learning.generic.mtynbusinesslayer;

import ir.mtyn.learning.generic.mtynbusinesslayer.dao.BaseEntity;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.BaseFilterEntity;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.Filterable;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.FilterableService;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.Service;

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
