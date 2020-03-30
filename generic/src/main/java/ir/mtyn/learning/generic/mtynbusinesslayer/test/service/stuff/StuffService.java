package ir.mtyn.learning.generic.mtynbusinesslayer.test.service.stuff;

import ir.mtyn.learning.generic.mtynbusinesslayer.AbstractFilterableService;
import ir.mtyn.learning.generic.mtynbusinesslayer.Dao;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.FilterResult;
import ir.mtyn.learning.generic.mtynbusinesslayer.test.model.stuff.Stuff;
import ir.mtyn.learning.generic.mtynbusinesslayer.test.model.stuff.StuffFilter;

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
