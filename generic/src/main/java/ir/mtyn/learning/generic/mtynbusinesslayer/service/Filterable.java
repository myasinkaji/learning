package ir.mtyn.learning.generic.mtynbusinesslayer.service;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Filterable<F extends BaseFilterEntity> {

    FilterResult filter(F filterEntity);
}
