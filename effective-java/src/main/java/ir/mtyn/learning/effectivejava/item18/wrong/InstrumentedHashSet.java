package ir.mtyn.learning.effectivejava.item18.wrong;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;


    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
//        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
