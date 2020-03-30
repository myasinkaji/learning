package ir.mtyn.learning.generic.resolve.adding2;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class SimpleAdder implements Adder<Integer> {

    @Override
    public Integer add(Integer one, Integer two) {
        Integer three = one + two;
        return three;
    }
}
