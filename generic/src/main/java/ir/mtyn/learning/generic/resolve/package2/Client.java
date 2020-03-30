package ir.mtyn.learning.generic.resolve.package2;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Client {

    public static void main(String[] args) {
        BoxTester tester = new BoxTester();
        ChildBox<Number> box = new NumberBox();
        tester.boxTest(box);

    }
}
