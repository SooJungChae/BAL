package com.java.basic.polyporhism;

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
        Gun ak47 = new AK47(30);
        Gun m16 = new M16(30);

        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
        ak47.shoot();
    }

}
