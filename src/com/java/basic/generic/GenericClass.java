package com.java.basic.generic;

/**
 * @author seongnamfc
 * @package com.java.basic.generic
 * @file GenericClass
 * @description
 * @date 2022/04/06
 */
public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
