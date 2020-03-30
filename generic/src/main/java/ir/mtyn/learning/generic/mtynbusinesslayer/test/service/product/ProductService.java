package ir.mtyn.learning.generic.mtynbusinesslayer.test.service.product;

import com.beroozresaan.shop.test.dao.ProductDao;
import com.beroozresaan.shop.test.model.product.Product;
import com.beroozresaan.shop.test.model.product.ProductFilter;
import ir.mtyn.learning.generic.mtynbusinesslayer.AbstractFilterableService;
import ir.mtyn.learning.generic.mtynbusinesslayer.service.FilterResult;

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
