package Sem4.Shields;

public class SmallShield extends Shield{
    public SmallShield(int armorPoint) {
        super(armorPoint);
    }

    @Override
    public String toString() {
        return "SmallShield{" +
                "armorPoint=" + armorPoint +
                '}';
    }
}
