package ir.mtyn.learning.generic.resolve.p1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Main extends A<Double> {
    private A<Integer> i = new A<>();
    private A<String> s = new A<>();


    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {

        new Main().test();
        System.out.println("end...");
    }
}
