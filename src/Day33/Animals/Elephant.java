package Day33.Animals;

public class Elephant extends Animal{


    public Elephant(String name, int age) {
        super(name, age);
        System.out.println("Elephant constructor");
    }

    public void splash(){
        System.out.println("Drink water");
    }

}
