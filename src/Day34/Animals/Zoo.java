package Day34.Animals;

import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> zooAnimals = new ArrayList<>();

    public void addAnimal(Animal animal){
        zooAnimals.add(animal);
    }

    public void removeAnimal(int id){
        for (int i = 0; i < zooAnimals.size(); i++) {
            if(zooAnimals.get(i).id == id){
                zooAnimals.remove(i);
            }
        }
    }

    public void displayAnimals(){
        for(Animal i : zooAnimals){
            System.out.println(i.id);
            System.out.println(i.name);
            System.out.println(i.age);
            System.out.println(i.type);
            if(i instanceof Lion){
                System.out.println(((Lion) i).doesEatMeat);
            }
            else if (i instanceof Elephant){
                System.out.println(((Elephant) i).hasTusk);

            }
            System.out.println();
        }
    }

    public void updateAnimalName(String oldName, String newName){
        for (int i = 0; i < zooAnimals.size(); i++) {
            if(zooAnimals.get(i).name.equals(oldName)){
                zooAnimals.get(i).name = newName;
            }
        }
    }

}
