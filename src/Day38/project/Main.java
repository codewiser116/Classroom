package Day38.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animalsCreated = new ArrayList<>();
        String answer = "";
        while(!answer.equals("x")){
            Dog dog = createDog();
            animalsCreated.add(dog);
            System.out.println();
            scanner.nextLine();
            System.out.println("Do you want to stop?");
            answer = scanner.nextLine();
        }
        System.out.println(animalsCreated.size());
    }

    public static Dog createDog(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter adoptionStatus:");
        boolean adoptionStatus = scanner.nextBoolean();
        Dog dog = new Dog(name,age, adoptionStatus);
        return dog;
    }

}
