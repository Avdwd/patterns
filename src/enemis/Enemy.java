package enemis;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int damage;
    protected String weaponType;
    protected String armorType;
    public abstract void getInfo();
    public abstract String getName();
    public abstract int getHealth();
    public abstract void getDamage(int damage);

    public abstract  int returnDamage();
    public abstract void getRandomID();
    public abstract void createEnemy();
}
