package com.java.basic.polyporhism;/**
  * @package com.java.basic.polyporhism
  * @file Payable
  * @description
  *
  * @author seongnamfc
  * @date 2022/04/05
  */
public interface Payable<T> {

    public void pay(T t);
    public void cancel();

}
