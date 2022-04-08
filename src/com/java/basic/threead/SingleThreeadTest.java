package com.java.basic.threead;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic.threead
 * @file SingleThreeadTest
 * @description
 * @date 2022/04/08
 */
public class SingleThreeadTest {

    @Test
    public void singleThreadTest() {
        SingleThread th = new SingleThread("first-test");
        th.run();
        SingleThread th2 = new SingleThread("second-test");
        th2.start();
    }

}

class SingleThread extends Thread {
    private int[] temp;
    public SingleThread(String threadName) {
        super(threadName);
        System.out.println("스레드 객체 생성");
        temp = new int[10];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
    }

    @Override
    public void run() {
        for (int s:temp) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("thread name : " + currentThread().getName());
            System.out.println("temp value : " + s);
        }
    }
}