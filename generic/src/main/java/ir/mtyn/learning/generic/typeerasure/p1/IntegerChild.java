package ir.mtyn.learning.generic.typeerasure.p1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class IntegerChild implements Parent {

    @Override
    public void add(Object object) {
        Integer i = (Integer) object;
        //...
    }

}
