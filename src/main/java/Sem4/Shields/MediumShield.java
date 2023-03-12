package Sem4.Shields;

public class MediumShield extends Shield{
    public MediumShield(int armorPoint) {
        super(armorPoint);
    }

    @Override
    public String toString() {
        return "MediumShield{" +
                "armorPoint=" + armorPoint +
                '}';
    }
}
