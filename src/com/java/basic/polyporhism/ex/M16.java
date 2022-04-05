package com.java.basic.polyporhism.ex;

/**
 * @author seongnamfc
 * @package com.java.basic.polyporhism
 * @file M16
 * @description
 * @date 2022/04/04
 */
public class M16 implements Gun {

    private Integer ammo;
    private final Integer MAX_AMMO = 30;

    public M16(Integer ammo) {
        this.ammo = ammo;
        System.out.println("M16 습득_" + MAX_AMMO + "/" + this.ammo);
    }


    @Override
    public void shoot() {
        this.ammo--;
        System.out.println("M16 사격 : " + MAX_AMMO + "/" + this.ammo);
    }

    @Override
    public void reload() {
        this.ammo = 30;
        System.out.println("M16 재장전 완료 : " + MAX_AMMO + "/" + this.ammo);
    }

    @Override
    public Integer getAmmo() {
        return null;
    }
}
