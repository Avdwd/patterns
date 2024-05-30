package enemis.animal;

public class CreatorAnimalHyena extends CreatorAnimal {
    @Override
    public Animal createAnimal() {
        return new Hyena();
    }
}
