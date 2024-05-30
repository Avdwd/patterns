package personage;

import things.Weapon;

public class CreatorGladiatorBestiarius extends CreatorGladiator{
    Gladiator Bestiarius;
    @Override
    public void displayInfo() {
        System.out.println(Bestiarius.getName());
        System.out.println(Bestiarius.getHealth());
        System.out.println(Bestiarius.getStrength());
    }

    @Override
    public void createGladiator(int health, int strength, String name) {
        Bestiarius =new Bestiarius(strength,health,name);
    }

    @Override
    public int getHealth() {
        return Bestiarius.getHealth();
    }

    @Override
    public int getStrength() {
        return Bestiarius.getStrength();
    }

    @Override
    public String getName() {
        return Bestiarius.getName();
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        Bestiarius.equipWeapon(weapon);
    }
}
