package com.java.basic.threead;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic.threead
 * @file ThreeadTest
 * @description
 * @date 2022/04/08
 */
public class ThreeadTest {

    @Test
    public void threadTestMethod() {
        A a = new A();
        a.run();
    }

}

class A extends Thread {

    // 스레드를 실행하는 메소드
    @Override
    public void run() {
        for (int i=0; i<=20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
