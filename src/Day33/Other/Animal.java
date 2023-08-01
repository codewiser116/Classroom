package Day33.Other;

public class Animal {
    String type;
    int age;
    boolean isMammal;

    public Animal(String type, int age, boolean isMammal){
        this.type = type;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void sleep(){
        System.out.println("Animals sleeps");
    }
}
