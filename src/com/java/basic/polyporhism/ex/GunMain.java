package com.java.basic.polyporhism.ex;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file GunMain
 * @description
 * @date 2022/04/04
 */
public class GunMain {

    @Test
    public void shootingTest() {

        Shooter s1 = new Shooter();
        s1.setGun(new AK47(30));

    }

}
