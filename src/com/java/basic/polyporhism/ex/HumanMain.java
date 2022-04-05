package com.java.basic.polyporhism.ex;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file HumanMain
 * @description
 * @date 2022/04/03
 */
public class HumanMain {

    public static void main(String[] args) {
        Human jaein = new Jaein();
        Human seokyeol = new SeokYeol();

        jaein.breathe();
        jaein.walk();
        seokyeol.breathe();
        seokyeol.walk();



    }


}
