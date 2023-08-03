package Day35.Animals;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public Animal(){
        System.out.println("This is empty constructor");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void makeSound(){
        System.out.println("Animal is making sound");
    }
}
