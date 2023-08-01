package Day33.Animals;

public class Animal{

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Animal constructor");
    }

    public Animal(String name){

    }

    int age;
    String name;

    public void sleep(){
        System.out.println("Sleep");
    }

    public void eat(){
        System.out.println("Eat");
    }


}
