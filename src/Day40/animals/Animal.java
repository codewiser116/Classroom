package Day40.animals;

public abstract class Animal {
    String name;
    int age;
    boolean adoptionStatus;

    public Animal(String name, int age, boolean adoptionStatus) {
        this.name = name;
        this.age = age;
        this.adoptionStatus = adoptionStatus;
    }

    public void displayAnimalInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(adoptionStatus);
        System.out.println();
    }


}
