package ir.mtyn.learning.generic.dao.dao;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Report<T extends BaseEntity> {

    T needType(T entity);

    T needlessType(T entity);
}
