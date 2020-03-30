package ir.mtyn.learning.designpattern.bridge.p1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public interface ShapeDrawer<T> {

    void draw(T shape);
}
