package ir.mtyn.learning.designpattern.bridge.p1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Circle implements Shape {

    private ShapeDrawer shapeDrawer;

    @Override
    public void draw() {
        shapeDrawer.draw(this);
    }
}
