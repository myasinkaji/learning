package ir.mtyn.learning.generic.typeerasure.p2;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Parent<T extends Entity> {

    void printID(T entity);
}
