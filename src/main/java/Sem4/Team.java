package Sem4;

import Sem4.Shields.Shield;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends BaseHero> implements Iterable<T>{

    List<T> dreamTeam = new ArrayList<>();

    public void addHero(T hero){
        dreamTeam.add(hero);
    }

    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int maxRange(){
        int maxRange = 0;
        for (T hero:dreamTeam) {
            if (hero instanceof Archer){
                if (((Archer) hero).shotRange()>maxRange){
                    maxRange = ((Archer) hero).shotRange();
                }
            }
        }
        return maxRange;
    }

    public int minArmorOfTeam(){
        int minArmor = 10000;
        for (T hero: dreamTeam){
            if (hero instanceof SwordMan){
                if(((SwordMan) hero).armor()<minArmor){
                    minArmor = ((SwordMan) hero).armor();
                }
            }
        }
        return minArmor;
    }
}
