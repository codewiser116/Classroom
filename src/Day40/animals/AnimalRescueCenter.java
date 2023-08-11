package Day40.animals;

import java.util.ArrayList;

public class AnimalRescueCenter {
    ArrayList<Animal> animalArrayList = new ArrayList<>();


    public void addAnimal(Animal animal){
        animalArrayList.add(animal);
    }

    public void listAnimals(){
        for (Animal animal : animalArrayList) {
            animal.displayAnimalInfo();
        }
    }

    public void listAnimalsByType(String type){
        for (Animal animal : animalArrayList) {
            if(type.equalsIgnoreCase("Dog") &&
            animal instanceof Dog){
                animal.displayAnimalInfo();
            }
            else if(type.equalsIgnoreCase("Cat")
            && animal instanceof Cat){
                animal.displayAnimalInfo();
            }
            else if(type.equalsIgnoreCase("Bird")
            && animal instanceof Bird){
                animal.displayAnimalInfo();
            }
        }
    }

    public void updateAdoptionStatus(String name, boolean adoptionStatus){
        for (Animal animal : animalArrayList) {
            if(animal.name.equals(name)){
                animal.adoptionStatus = adoptionStatus;
            }
        }
    }
}
