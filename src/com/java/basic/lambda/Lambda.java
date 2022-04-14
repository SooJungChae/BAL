package com.java.basic.lambda;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic
 * @file lambda
 * @description
 * @date 2022/04/14
 */
public class Lambda {

    @Test
    public void test() {
        Lambda lambda = new Lambda();
        System.out.println(lambda.sum(10, 100));

        System.out.println();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        });

        Thread threadLambda = new Thread(() -> {
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        });

    }

    public int sum(int a, int b) {
        return a + b;
    }



}
