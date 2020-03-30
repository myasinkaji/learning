package ir.mtyn.learning.generic.resolve.package2;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class NumberBox implements ChildBox<Number> {
    @Override
    public Number add(Number one, Number two) {
        System.out.println("You are here");
        return null;
    }
}
