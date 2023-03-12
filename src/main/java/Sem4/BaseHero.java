package Sem4;

import Sem4.Weapons.Weapon;

public abstract class BaseHero {
    private String name;
    private int health;
    private Weapon weapon;

    public BaseHero(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon=" + weapon +
                '}';
    }
}
