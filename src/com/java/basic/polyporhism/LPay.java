package com.java.basic.polyporhism;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file LPay
 * @description
 * @date 2022/04/05
 */
public class LPay implements Payable {

    @Override
    public void pay() {
        System.out.println("LPay 결제");
    }

    @Override
    public void cancel() {
        System.out.println("LPay 결제 취소");
    }
}
