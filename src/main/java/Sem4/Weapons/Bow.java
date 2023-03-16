package Sem4.Weapons;

import java.util.Random;

public class Bow extends Weapon{

    public int range;

    public Bow(int damagePoint, int range) {
        super(damagePoint);
        this.range = range;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "range=" + range +
                ", damagePoint=" + damagePoint +
                '}';
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(damagePoint);
    }
}
