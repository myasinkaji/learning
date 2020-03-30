package ir.mtyn.learning.generic.resolve.questions.q3;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Client {

    public static void main(String[] args) {
        Box<Integer> box = (Box<Integer>)(Object) new NumberBox();         //Todo Why this is true?
        box.add(1, 1);
    }
}
