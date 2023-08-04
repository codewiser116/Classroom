package Day36.accessModifiers;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.age); // access default variable
        System.out.println(animal.type); // access protected
        animal.printDetails();
    }
}
