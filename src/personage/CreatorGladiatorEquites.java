package personage;

import things.Weapon;

public class CreatorGladiatorEquites extends CreatorGladiator{
    Gladiator Equites;
    @Override
    public void displayInfo() {
        System.out.println(Equites.getName());
        System.out.println(Equites.getHealth());
        System.out.println(Equites.getStrength());
    }

    @Override
    public void createGladiator(int health, int strength, String name) {
        Equites =new Equites(strength,health,name);
    }
    @Override
    public int getHealth() {
        return Equites.getHealth();
    }

    @Override
    public int getStrength() {
        return Equites.getStrength();
    }

    @Override
    public String getName() {
        return Equites.getName();
    }
    @Override
    public void equipWeapon(Weapon weapon) {
        Equites.equipWeapon(weapon);
    }
}
