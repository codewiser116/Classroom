package Day34.Animals;

public class Animal {
    int id;
    String name;
    int age;
    String type;

    public Animal(int id, String name, int age, String type){
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(type);
    }

    public void eat(){
        System.out.println(name + " eats food!");
    }
}
