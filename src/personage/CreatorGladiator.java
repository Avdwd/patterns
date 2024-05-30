package personage;

import things.Weapon;

public abstract class CreatorGladiator {
    public abstract void displayInfo();
    public abstract void createGladiator(int health,int strength, String name);
    public abstract int getHealth();
    public abstract int getStrength();
    public abstract String getName();
    public abstract void equipWeapon(Weapon weapon);
}
