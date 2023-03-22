package Sem4.Weapons;

public abstract class Weapon implements Weaponable{
    protected int damagePoint;

    public Weapon(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
