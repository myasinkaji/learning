package ir.mtyn.learning.generic.resolve.adding2;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface Adder<T extends Number> {

    T add(T one, T two);
}
