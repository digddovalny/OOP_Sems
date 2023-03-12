package Sem4;

import Sem4.Weapons.Bow;

public class Archer extends BaseHero{
    public Archer(String name, int health, Bow weapon) {
        super(name, health, weapon);
    }

    @Override
    public String toString() {
        return "Archer{} " + super.toString();
    }

    public int shotRange(){
        return ((Bow)getWeapon()).range;
    }
}
