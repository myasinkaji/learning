package ir.mtyn.learning.generic.resolve.questions.q1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Client {

    public static void main(String[] args) {
        //Todo Why this is true
        Box<Integer> box = new NumberBox();
        box.add(1, 1);
    }
}
