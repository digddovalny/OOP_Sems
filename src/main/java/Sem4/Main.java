package Sem4;

import Sem4.Shields.BigShield;
import Sem4.Shields.MediumShield;
import Sem4.Shields.SmallShield;
import Sem4.Weapons.Bow;
import Sem4.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<SwordMan> squadS = new Team<>();
        squadS.addHero(new SwordMan("Peter",100,new Sword(15),new MediumShield(35)));
        squadS.addHero(new SwordMan("Vasya",120,new Sword(25),new SmallShield(15)));
        squadS.addHero(new SwordMan("Peter",100,new Sword(15),new SmallShield(35)));
        squadS.addHero(new SwordMan("Vazgen",123,new Sword(25),new BigShield(95)));
        squadS.addHero(new SwordMan("Erika",55,new Sword(22),new MediumShield(66)));
        squadS.addHero(new SwordMan("David",68,new Sword(43),new MediumShield(50)));

        for (SwordMan hero:squadS) {
            System.out.println(hero);
        }
        System.out.println(squadS.maxRange());
        System.out.println(squadS.minArmorOfTeam());
        System.out.println("============================================================================");

        Team<BaseHero> squadSolyanka = new Team<>();
        squadSolyanka.addHero(new Archer("Greek", 50, new Bow(35,50)));
        squadSolyanka.addHero(new Archer("Beerka", 65, new Bow(43,80)));
        squadSolyanka.addHero(new SwordMan("Kostay",160,new Sword(5),new BigShield(90)));
        squadSolyanka.addHero(new SwordMan("Kostay",10,new Sword(50),new BigShield(300)));

        for (BaseHero hero:squadSolyanka) {
            System.out.println(hero);
        }
        System.out.println(squadSolyanka.maxRange());
        System.out.println(squadSolyanka.minArmorOfTeam());
    }
}
