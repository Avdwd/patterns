package personage;

import things.Weapon;

public class CreatorGladiatorThracian extends CreatorGladiator{
    Gladiator Thracian;
    @Override
    public void displayInfo() {
        System.out.println(Thracian.getName());
        System.out.println(Thracian.getHealth());
        System.out.println(Thracian.getStrength());
    }

    @Override
    public void createGladiator(int health, int strength, String name) {
        Thracian =new Thracian(strength,health,name);
    }
    @Override
    public int getHealth() {
        return Thracian.getHealth();
    }

    @Override
    public int getStrength() {
        return Thracian.getStrength();
    }

    @Override
    public String getName() {
        return Thracian.getName();
    }
    @Override
    public void equipWeapon(Weapon weapon) {
        Thracian.equipWeapon(weapon);
    }
}
