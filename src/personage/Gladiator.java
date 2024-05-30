package personage;

import things.Weapon;

public abstract class Gladiator {
    protected int health;
    protected int strength;
    protected Weapon weapon;
    protected String name;
    Gladiator(int health,int strength, String name){
        this.health = health;
        this.strength = strength;
        this.name =name;
    }



    abstract public String getName();
    abstract public int getStrength();
    abstract public int getHealth();
    abstract public void attack(String name);
    abstract public void equipWeapon(Weapon weapon);
}
