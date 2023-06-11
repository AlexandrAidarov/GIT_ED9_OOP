package Seminar4_OOP;

import Seminar4_OOP.warriors.Archer;
import Seminar4_OOP.warriors.Infantryman;
import Seminar4_OOP.warriors.Warrior;
import Seminar4_OOP.weapons.meleeWeapon.Axe;
import Seminar4_OOP.weapons.meleeWeapon.Sword;
import Seminar4_OOP.weapons.rangedWeapon.Bow;
import Seminar4_OOP.weapons.rangedWeapon.CrossBow;

public class MainClassForSeminarFour {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150,new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow()));
        teamArchers.add(new Archer("Piter",100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe()), (new Archer("Robin", 100, new Bow())));

        battle1.fight();

    }
}
