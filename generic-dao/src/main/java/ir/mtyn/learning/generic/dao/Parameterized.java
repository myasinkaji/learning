package ir.mtyn.learning.generic.dao;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Type;

/**
 * @author Mohammad Yasin Sadeghi
 */
public abstract class Parameterized<T> {
    private Class<T> clazz;

    public Parameterized() {
        Type type = ((ParameterizedTypeImpl) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        clazz = (type instanceof Class) ? (Class<T>) type : null;
    }

    protected Class<T> getClazz() {
        return clazz;
    }
}
