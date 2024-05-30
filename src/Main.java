import enemis.CreatorEnemiAnimal;
import enemis.CreatorEnemis;
import enemis.CreatorEnemyPeople;
import personage.CreatorGladiator;
import personage.CreatorGladiatorGaul;
import things.Weapon;
import things.WeaponBuilder;

public class Main {
    private static CreatorGladiatorGaul gladiatorGaulladiator;
    private static CreatorEnemis en;

    public static void main(String[] args) {
        gladiatorGaulladiator = new CreatorGladiatorGaul();
        gladiatorGaulladiator.createGladiator(10000,1000,"Sayl");
        gladiatorGaulladiator.displayInfo();

        WeaponBuilder ex = new WeaponBuilder().setDamage(100).setName("qyrte");

        gladiatorGaulladiator.equipWeapon(ex.build());

        gladiatorGaulladiator.displayInfo();

//        en = new CreatorEnemiAnimal();
//        en.createEnemy();
//        en.getInfoEnemy();
            en =new CreatorEnemyPeople();
            en.createEnemy();
            en.getInfoEnemy();
    }
}