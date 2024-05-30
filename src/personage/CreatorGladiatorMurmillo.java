package personage;

import things.Weapon;

public class CreatorGladiatorMurmillo extends CreatorGladiator{
    Gladiator Murmillo;
    @Override
    public void displayInfo() {
        System.out.println(Murmillo.getName());
        System.out.println(Murmillo.getHealth());
        System.out.println(Murmillo.getStrength());
    }

    @Override
    public void createGladiator(int health, int strength, String name) {
        Murmillo =new Murmillo(strength,health,name);
    }

    @Override
    public int getHealth() {
        return Murmillo.getHealth();
    }

    @Override
    public int getStrength() {
        return Murmillo.getStrength();
    }

    @Override
    public String getName() {
        return Murmillo.getName();
    }
    @Override
    public void equipWeapon(Weapon weapon) {
        Murmillo.equipWeapon(weapon);
    }
}
