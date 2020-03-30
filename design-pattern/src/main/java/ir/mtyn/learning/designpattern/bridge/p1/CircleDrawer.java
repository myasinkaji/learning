package ir.mtyn.learning.designpattern.bridge.p1;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class CircleDrawer implements ShapeDrawer<Circle> {


    @Override
    public void draw(Circle circle) {
        System.out.println(circle);
    }

}
