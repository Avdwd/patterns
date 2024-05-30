package enemis.animal;

public abstract class CreatorAnimal {
    public Animal animalEnemy(){
        Animal newAnimal = createAnimal();
        return newAnimal;
    }

    public abstract Animal createAnimal();
}
