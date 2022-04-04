package com.java.basic.polyporhism;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file Shooter
 * @description
 * @date 2022/04/04
 */
public class Shooter {

    private Gun gun;

    public void setGun(Gun gun) {
        this.gun = gun;
//        System.out.println("AK47 습득_" + gun.MAX_AMMO + "/" + gun.getAmmo());
    }

}
