package Seminar4_OOP.warriors;


import Seminar4_OOP.shield.HavyShield;
import Seminar4_OOP.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee>{

    public Infantryman(String name, int healthPoint, Melee weapon, HavyShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
