package ir.mtyn.learning.generic.resolve.p1.dao.entity;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class BaseEntity {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
