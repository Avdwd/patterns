package personage;

import things.Weapon;

public class CreatorGladiatorGaul extends CreatorGladiator{
    Gladiator Gaul;
    @Override
    public void displayInfo() {
        System.out.println(Gaul.getName());
        System.out.println(Gaul.getHealth());
        System.out.println(Gaul.getStrength());
    }

    @Override
    public void createGladiator(int health, int strength, String name) {
        Gaul =new Gaul(strength,health,name);
    }
    @Override
    public int getHealth() {
        return Gaul.getHealth();
    }

    @Override
    public int getStrength() {
        return Gaul.getStrength();
    }

    @Override
    public String getName() {
        return Gaul.getName();
    }
    @Override
    public void equipWeapon(Weapon weapon) {
        Gaul.equipWeapon(weapon);
    }
}
