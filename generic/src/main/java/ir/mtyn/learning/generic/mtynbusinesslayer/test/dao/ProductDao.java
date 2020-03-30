package ir.mtyn.learning.generic.mtynbusinesslayer.test.dao;

import ir.mtyn.learning.generic.mtynbusinesslayer.Dao;
import ir.mtyn.learning.generic.mtynbusinesslayer.test.model.product.Product;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class ProductDao extends Dao<Long, Product> {

    public Product specificMethod() {
        byId(1L);
        needlessType(null);
        needType(null);

        return null;
    }

}
