package Day40;

import java.util.LinkedHashSet;

public class Animal {

    public Animal(String name){

    }

    public void methodA(){
        System.out.println("METHOD A");
    }

}

class Pet extends Animal {
    int age;

    public Pet(String name, int age) {
        super(name);
        this.age = age;
    }

    public void methodB(){
        System.out.println("METHOD B");
    }
}

class Dog extends Pet {

    public static void main(String[] args) {
        String string = new String("hello");
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i = 0; i < string.length(); i++){
            set.add(string.charAt(i));
        }
        System.out.println(set);
        String result = "";
        for(Character i: set){
            result+=i;
        }
        System.out.println(result);

    }

    public void createDog(String name, int age){
        // Dog dog = new Dog(name, age);
        // rescueCenter.add(Dog);
    }

    public void createDog(String name, int age, String owner){
        // Dog dog = new Dog(name, age, owner);

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void methodA() {
        System.out.println("METHOD A in DOG class");
    }

    @Override
    public void methodB() {
        System.out.println("METHOD B in DOG class");
    }

    public void someMethod(){
        methodA();
        methodB();
    }
}
