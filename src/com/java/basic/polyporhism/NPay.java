package com.java.basic.polyporhism;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file NPay
 * @description
 * @date 2022/04/05
 */
public class NPay implements Payable {
    @Override
    public void pay(Object o) {
        System.out.println("NPay 결제");
    }

    @Override
    public void cancel() {
        System.out.println("NPay 결제");
    }
}
