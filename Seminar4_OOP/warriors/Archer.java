package Seminar4_OOP.warriors;


import Seminar4_OOP.weapons.Weapon;
import Seminar4_OOP.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}
