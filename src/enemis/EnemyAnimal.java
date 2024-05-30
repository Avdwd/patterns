package enemis;
import java.util.Random;
import enemis.animal.CreatorAnimal;
import enemis.animal.CreatorAnimalHyena;
import enemis.animal.CreatorAnimalLion;
import enemis.animal.CreatorAnimalWildDog;
import enemis.animal.Animal;
public class EnemyAnimal extends Enemy{
    private CreatorAnimal animal;
    private Animal enemy;

    EnemyAnimal(){
        createEnemy();
    }

    @Override
    public void getInfo() {
        System.out.println(getName());
        System.out.println(getHealth());
        System.out.println(returnDamage());

    }

    @Override
    public String getName() {
        return enemy.getName();
    }

    @Override
    public int getHealth() {
        return enemy.getHealth();
    }

    @Override
    public void getDamage(int damage) {
        enemy.getDamage(damage);
    }


    @Override
    public int returnDamage() {
        return enemy.returnDamage();
    }

    @Override
    public void getRandomID() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        animal =  getEnemy(randomInt);
        assert animal != null;
        enemy = animal.createAnimal();
    }

    @Override
    public void createEnemy() {
        getRandomID();
    }

    private CreatorAnimal getEnemy(int id){
        switch (id){
            case 0: return new CreatorAnimalHyena();
            case 1: return new CreatorAnimalLion();
            case 2: return new CreatorAnimalWildDog();
            default:
                break;
//                throw new IllegalStateException("Unexpected value: " + id);
        }
        return null;
    }
}
