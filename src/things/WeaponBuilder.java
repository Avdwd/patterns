package things;

public class WeaponBuilder {
    private Weapon weapon;

    public WeaponBuilder() {
        this.weapon = new Weapon();
    }

    public WeaponBuilder setName(String name) {
        weapon.setName(name);
        return this;
    }

    public WeaponBuilder setDamage(int damage) {
        weapon.setDamage(damage);
        return this;
    }

    public Weapon build() {
        return weapon;
    }
}
