package Day34.Animals;

import Day34.Animals.Elephant;
import Day34.Animals.Lion;
import Day34.Animals.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion1 = new Lion(1, "Lion1",2,"liontype1",
                true);
        Lion lion2 = new Lion(2, "Lion2",5,"liontype1",
                true);

        Elephant elephant1 = new Elephant(3, "Eleph1", 5,
                "elephtype1",true);
        Elephant elephant2 = new Elephant(4, "Eleph2", 1,
                "elephtype1",false);
        Elephant elephant3 = new Elephant(5, "Eleph3", 2,
                "elephtype1",false);

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(elephant1);
        zoo.addAnimal(elephant2);
        zoo.addAnimal(elephant3);

        zoo.displayAnimals();
        zoo.removeAnimal(5);
        zoo.removeAnimal(4);
        zoo.displayAnimals();
        zoo.updateAnimalName("Eleph1","New Animal");
        zoo.displayAnimals();

    }
}
