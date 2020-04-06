package ir.mtyn.learning.generic.dao.test.service.product;

import ir.mtyn.learning.generic.dao.AbstractFilterableService;
import ir.mtyn.learning.generic.dao.service.FilterResult;
import ir.mtyn.learning.generic.dao.test.dao.ProductDao;
import ir.mtyn.learning.generic.dao.test.model.product.Product;
import ir.mtyn.learning.generic.dao.test.model.product.ProductFilter;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class ProductService extends AbstractFilterableService<Long, Product, ProductFilter, ProductDao> {

//    @Autowired
    public ProductService(ProductDao productDao) {
        super(productDao);
    }

    public void specificMethod() {
        getDao().specificMethod();
    }

    @Override
    public FilterResult filter(ProductFilter productFilter) {
        return null;
    }
}
