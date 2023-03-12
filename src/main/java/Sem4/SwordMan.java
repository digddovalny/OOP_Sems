package Sem4;

import Sem4.Shields.Shield;
import Sem4.Shields.Shieldable;
import Sem4.Weapons.Weapon;

public class SwordMan extends BaseHero implements Shieldable {
    private Shield shield;

    public SwordMan(String name, int health, Weapon weapon, Shield shield) {
        super(name, health, weapon);
        this.shield = shield;
    }

    public Shield getShield() {
        return shield;
    }

    @Override
    public int armor() {
        return shield.getArmorPoint();
    }

    @Override
    public String toString() {
        return "SwordMan{" +
                "shield=" + shield +
                "} " + super.toString();
    }
}
