package Day38.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        for(int i = 1; i <= 4; i++){
            animals.add(createADog());
        }
        System.out.println(animals.size());

    }

    public static Dog createADog(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        boolean adoptionStatus = scanner.nextBoolean();
        Dog dog1 = new Dog(name, age, adoptionStatus);

        return dog1;
    }
}
