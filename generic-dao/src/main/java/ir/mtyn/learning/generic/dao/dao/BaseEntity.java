package ir.mtyn.learning.generic.dao.dao;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class BaseEntity<ID extends Number> {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
