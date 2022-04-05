package com.java.basic.polyporhism;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file Params
 * @description
 * @date 2022/04/05
 */
public class Params<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
