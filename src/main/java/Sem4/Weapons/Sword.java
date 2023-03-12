package Sem4.Weapons;

import java.util.Random;

public class Sword extends Weapon{
    public Sword(int damagePoint) {
        super(damagePoint);
    }

    @Override
    public String toString() {
        return "Sword{" +
                "damagePoint=" + damagePoint +
                '}';
    }

    @Override
    public int damage() {
        return new Random().nextInt(damagePoint);
    }
}
