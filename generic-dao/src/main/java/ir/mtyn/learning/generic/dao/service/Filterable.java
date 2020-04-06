package ir.mtyn.learning.generic.dao.service;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Filterable<F extends BaseFilterEntity> {

    FilterResult filter(F filterEntity);
}
