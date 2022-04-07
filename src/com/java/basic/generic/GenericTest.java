package com.java.basic.generic;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author seongnamfc
 * @package com.java.basic.generic
 * @file GenericTest
 * @description
 * @date 2022/04/06
 */
public class GenericTest {

    @Test
    public void testClassGeneric() {
        GenericClass gc = new GenericClass<>();
        GenericClass<String> gcStr = new GenericClass<>();
        GenericClass<Integer> gcInteger = new GenericClass<>();
        System.out.println("test");
    }

    @Test
    public void testNonGeneric() {
        // 제네릭 미사용
        ArrayList list = new ArrayList();
        list.add("test!!");
        String tmp = (String) list.get(0);
        System.out.println(tmp);
    }

    @Test
    public void testGeneraic() {
        ArrayList<String> list = new ArrayList<>();
        list.add("배고파");
//        list.add(1);  // Interger라 안됨
        String tmp = list.get(0);
        System.out.println(tmp);
    }
}
