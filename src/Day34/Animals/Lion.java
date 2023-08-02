package Day34.Animals;

public class Lion extends Animal{
    boolean doesEatMeat;

    public Lion(int id, String name, int age, String type, boolean doesEatMeat) {
        super(id, name, age, type);
        this.doesEatMeat = doesEatMeat;
    }

    public void makeSound(){
        System.out.println("Lion is making a sound");
    }
}
