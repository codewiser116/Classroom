package Day23;

import java.util.Scanner;

public class Car {

    int wheels = 4;
    String model ;
    String brand;
    int maxSpeed ;
    double price = 50000;
    String color = "RED";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car tesla = new Car();
        tesla.model = "Tesla";
        tesla.maxSpeed = 280;

        Car mercedes = new Car();
        mercedes.model = scanner.nextLine();
        mercedes.maxSpeed = scanner.nextInt();
        tesla.maxSpeed = scanner.nextInt();

        System.out.println("Telsa wheels "+tesla.wheels);
        System.out.println("Tesla model "+ tesla.model);
        System.out.println("Tesla maxspeed "+ tesla.maxSpeed);

        System.out.println();

        System.out.println("Mercedes wheels "+ mercedes.wheels);
        System.out.println("Mercedes model "+mercedes.model);
        System.out.println("Mercedes maxspeed "+mercedes.maxSpeed);
    }

}
