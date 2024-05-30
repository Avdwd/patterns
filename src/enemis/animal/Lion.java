package enemis.animal;

public class Lion implements Animal {
    protected int health = 1000;
    protected int damage = 100;
    protected String name = "Lion";
    @Override
    public void getDamage(int damage) {
        if(this.health<=0){
            death();
        }else {
            this.health = this.health - damage;
        }
    }

    @Override
    public int returnDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void death() {
        System.out.println("Animal dead");
    }

    @Override
    public int getHealth() {
        if(health<=0){
            death();
        }else {
            return health;
        }
        return 0;
    }
}
