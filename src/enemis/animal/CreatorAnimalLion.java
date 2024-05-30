package enemis.animal;

public class CreatorAnimalLion extends CreatorAnimal {
    @Override
    public Animal createAnimal() {
        return new Lion();
    }
}
