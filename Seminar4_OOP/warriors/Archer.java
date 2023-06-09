package Seminar4_OOP.warriors;


import Seminar4_OOP.shield.LightShield;
import Seminar4_OOP.shield.Shields;
import Seminar4_OOP.weapons.Weapon;
import Seminar4_OOP.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged> {

    
    public Archer(String name, int healthPoint, Ranged weapon, Shields shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int distance(){
        return super.getWeapon().distance();
    }



    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }

    @Override
    public int resistance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resistance'");
    }



 
}
