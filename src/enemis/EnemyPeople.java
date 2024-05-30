package enemis;

import personage.*;

import java.util.Random;

public class EnemyPeople extends Enemy{
    private CreatorGladiator gladiator;

    @Override
    public void getInfo() {
        gladiator.displayInfo();
    }

    @Override
    public String getName() {
        return gladiator.getName();
    }

    @Override
    public int getHealth() {
        return gladiator.getHealth();
    }

    @Override
    public void getDamage(int damage) {

    }


    @Override
    public int returnDamage() {
        return gladiator.getStrength();
    }

    @Override
    public void getRandomID() {

        Random random = new Random();
        int randomInt = random.nextInt(6);
        gladiator =  getEnemy(randomInt);

    }

    @Override
    public void createEnemy() {
        getRandomID();
        gladiator.createGladiator(1000,100,"EnemyGladiator");
        gladiator.displayInfo();

    }

    private CreatorGladiator getEnemy(int id){
        switch (id){

            case 1: return new CreatorGladiatorBestiarius();
            case 2: return new CreatorGladiatorEquites();
            case 3: return new CreatorGladiatorGaul();
            case 4: return new CreatorGladiatorMurmillo();
            case 5:return new CreatorGladiatorThracian();
            default:
                throw new IllegalStateException("Unexpected value: " + id);
        }
    }
}
