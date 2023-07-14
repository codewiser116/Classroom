package Day23;

public class Dog {

    String breed;
    int size;
    int age = 5;
    String color;

    public void eat(){
        System.out.println("Dog eats");
    }

    public void sleep(){
        System.out.println("Dog sleeps");
    }

    public void bark(){
        System.out.println("Dog barks");
    }

    public void dogsName(String name){
        System.out.println("Dog's name is "+ name);
    }

    public void printMyColor(){
        System.out.println("Color "+ color);
    }



    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printMyColor();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.dogsName("BR");

        System.out.println();
        Dog dog2 = new Dog();
        dog2.color = "white";
        dog2.eat();
        dog2.sleep();
        dog2.bark();
        dog.dogsName("RB");
    }






}
