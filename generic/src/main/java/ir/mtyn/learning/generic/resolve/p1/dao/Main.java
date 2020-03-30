package ir.mtyn.learning.generic.resolve.p1.dao;

import ir.mtyn.learning.generic.resolve.p1.dao.entity.BaseEntity;
import ir.mtyn.learning.generic.resolve.p1.dao.entity.Widget;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Main<T extends BaseEntity> {

    private PersonDao personDao = new PersonDao();
//    private WidgetDao<?> unknownWidgetDao = new WidgetDao<>();
//    private WidgetDao<T> tWidgetDao = new WidgetDao<>();
    private WidgetDao<Widget> widgetWidgetDao = new WidgetDao<Widget>();

    private void start() {

        System.out.println("adfsa");
    }

    public static void main(String[] args) {
        new Main<>().start();
    }
}
