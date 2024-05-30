package enemis;

public class CreatorEnemiAnimal extends CreatorEnemis {
    private Enemy animalEnemy;
    @Override
    public void getInfoEnemy() {
        animalEnemy.getInfo();
    }

    @Override
    public void createEnemy() {
        animalEnemy =new EnemyAnimal();
        animalEnemy.createEnemy();
    }


}
