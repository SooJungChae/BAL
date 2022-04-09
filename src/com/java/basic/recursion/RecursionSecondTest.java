package com.java.basic.recursion;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic.recursion
 * @file RecursionSecondTest
 * @description
 * @date 2022/04/09
 */
public class RecursionSecondTest {

    @Test
    public void test() {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

}
