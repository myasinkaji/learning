package ir.mtyn.learning.generic.mtynbusinesslayer;

import ir.mtyn.learning.generic.mtynbusinesslayer.dao.BaseEntity;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.BaseFilterEntity;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.Filterable;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.Service;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class AbstractFilterableService<ID extends Number, T extends BaseEntity<ID>, F extends BaseFilterEntity>
        extends AbstractService<ID, T>
        implements Filterable<F> {
}
