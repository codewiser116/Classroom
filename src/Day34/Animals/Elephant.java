package Day34.Animals;

public class Elephant extends Animal{

    boolean hasTusk;

    public Elephant(int id, String name, int age, String type, boolean hasTusk) {
        super(id, name, age, type);
        this.hasTusk = hasTusk;
    }

    public void sprayWater(){
        System.out.println("Elephant is spraying water!");
    }

}
