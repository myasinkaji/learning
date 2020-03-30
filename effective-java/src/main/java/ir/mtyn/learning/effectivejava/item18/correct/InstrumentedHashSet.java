package ir.mtyn.learning.effectivejava.item18.correct;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class InstrumentedHashSet<E> {

    private HashSet<E> hashSet;

    private int addCount;

    public InstrumentedHashSet() {
        hashSet = new HashSet<E>();
    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor) {
        hashSet = new HashSet<E>(initialCapacity, loadFactor);
    }

    public boolean add(E e) {
        addCount++;
        return hashSet.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return hashSet.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}
