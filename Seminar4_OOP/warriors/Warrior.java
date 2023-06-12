package Seminar4_OOP.warriors;


import Seminar4_OOP.shield.Shields;
import Seminar4_OOP.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon> implements Shields {
    private final String name;
    private int healthPoint;
    private W weapon;
    private Shields shield;

    public Warrior(String name, int healthPoint, W weapon, Shields shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }
    public int hitResistanse() {
        Random rnd = new Random();

        return rnd.nextInt(0, shield.resistance() + 1);
    }

    public void reduceHealth(int damage) {
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d, Shield: %d", name, weapon, healthPoint, shield);
    }
}
