package com.java.basic.recursion;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic.recursion
 * @file RecursionTest
 * @description
 * @date 2022/04/09
 */
public class RecursionTest {

    @Test
    public void test() {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
