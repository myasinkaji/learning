package ir.mtyn.learning.generic.typeerasure.p1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class StringChild implements Parent {

    @Override
    public void add(Object object) {
        String string = (String) object;
        //...
    }
}
