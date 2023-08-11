package Day40.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalRescueCenter center = new AnimalRescueCenter();
        int choice = 0;
        while(choice!=5){
            System.out.println("Welcome to the Animal Rescue Center");
            System.out.println("1. Add animal");
            System.out.println("2. List animals");
            System.out.println("3. List animals by type");
            System.out.println("4. Update adoption status");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> {
                    System.out.println("What type of animal you want to create?");
                    String typeToCreate = scanner.nextLine();
                    switch (typeToCreate){
                        case "dog" -> {
                            String name = scanner.nextLine();
                            int age = scanner.nextInt();
                            boolean adoptionStatus = scanner.nextBoolean();
                            Dog dog = new Dog(name, age, adoptionStatus);
                            center.addAnimal(dog);
                        }
                        case "cat" -> {
                            String name = scanner.nextLine();
                            int age = scanner.nextInt();
                            boolean adoptionStatus = scanner.nextBoolean();
                            Cat cat = new Cat(name, age, adoptionStatus);
                            center.addAnimal(cat);
                        }
                        case "bird" -> {
                            String name = scanner.nextLine();
                            int age = scanner.nextInt();
                            boolean adoptionStatus = scanner.nextBoolean();
                            Bird bird = new Bird(name, age, adoptionStatus);
                            center.addAnimal(bird);
                        }
                        default -> {
                            System.out.println("Invalid type of animal");
                        }
                    }
                }
                case 2 -> {
                    center.listAnimals();
                }
                case 3 -> {
                    System.out.println("What type of animals do you want to display");
                    String type = scanner.nextLine();
                    center.listAnimalsByType(type);
                }
                case 4 -> {
                    System.out.println("Enter name of animal");
                    String name = scanner.nextLine();
                    System.out.println("Enter adoption status");
                    boolean adoptionStatus = scanner.nextBoolean();
                    center.updateAdoptionStatus(name,adoptionStatus);
                }
                case 5 -> {}
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }

    }


}
