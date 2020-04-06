package ir.mtyn.learning.generic.dao.test.service.stuff;

import ir.mtyn.learning.generic.dao.AbstractFilterableService;
import ir.mtyn.learning.generic.dao.Dao;
import ir.mtyn.learning.generic.dao.service.FilterResult;
import ir.mtyn.learning.generic.dao.test.model.stuff.Stuff;
import ir.mtyn.learning.generic.dao.test.model.stuff.StuffFilter;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class StuffService extends AbstractFilterableService<Integer, Stuff, StuffFilter, Dao<Integer, Stuff>> {


    public StuffService() {
        super();
    }

    public void specificMethod() {
        needlessType(null);
    }

    @Override
    public FilterResult filter(StuffFilter stuffFilter) {
        return null;
    }
}
