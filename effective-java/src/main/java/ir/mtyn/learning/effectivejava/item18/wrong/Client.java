package ir.mtyn.learning.effectivejava.item18.wrong;

import java.util.Arrays;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Client {

    public static void main(String[] args) {
        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<>();
        instrumentedHashSet.addAll(Arrays.asList("a", "b", "c"));

        System.out.println(instrumentedHashSet.getAddCount());
    }
}
