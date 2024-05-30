package enemis;

public class CreatorEnemyPeople extends CreatorEnemis{
    private Enemy peopleEnemy;
    @Override
    public void getInfoEnemy() {
        peopleEnemy.getInfo();
    }

    @Override
    public void createEnemy() {
        peopleEnemy = new EnemyPeople();
        peopleEnemy.createEnemy();
    }
}
