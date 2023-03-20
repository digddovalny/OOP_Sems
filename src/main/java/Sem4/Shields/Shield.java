package Sem4.Shields;

public abstract class Shield{
    protected int armorPoint;

    public Shield(int armorPoint) {
        this.armorPoint = armorPoint;
    }

    public int getArmorPoint() {
        return armorPoint;
    }
}
