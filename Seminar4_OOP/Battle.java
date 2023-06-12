package Seminar4_OOP;


import Seminar4_OOP.warriors.Warrior;
import Seminar4_OOP.weapons.Weapon;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
            int damage1 = w1.hit();
            int resistanse = w1.hitResistanse();
            if( damage1 < resistanse) damage1 = 0;
            else damage1 -= resistanse;
            System.out.println("first hit second : " + damage1);
            w2.reduceHealth(damage1);
            int damage2 = w2.hit();
            int resistanse2 = w2.hitResistanse();
            if( damage2 < resistanse2) damage2 = 0;
            else damage2 -= resistanse2;
            System.out.println("second hit first : " + damage2);
            w1.reduceHealth(damage2);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
