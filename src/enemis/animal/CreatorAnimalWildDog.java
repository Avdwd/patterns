package enemis.animal;

public class CreatorAnimalWildDog extends CreatorAnimal{
    @Override
    public Animal createAnimal() {
        return new WildDog();
    }
}
