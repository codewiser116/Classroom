package Day38.project;

public abstract class Animal {
    String name;
    int age;
    boolean adoptionStatus;

    public Animal(String name, int age, boolean adoptionStatus){
        this.name = name;
        this.age = age;
        this.adoptionStatus = adoptionStatus;
    }
}
