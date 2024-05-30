package personage;

import things.Weapon;

public class Thracian extends Gladiator{

    Weapon weapon;
    Thracian(int strength, int health, String name){
        super(health, strength,  name);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void attack(String name) {
        if (weapon != null) {
            System.out.println(name + " attacks " + name + " with " + weapon.getName() + " for " + weapon.getDamage() + " damage!");
        } else {
            System.out.println(name + " attacks " + name + " with bare hands for " + strength + " damage!");
        }
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.strength += weapon.getDamage();
    }
}
