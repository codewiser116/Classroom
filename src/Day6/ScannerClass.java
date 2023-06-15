package Day6;


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean bool1 = scanner.nextBoolean();
//        int int1 = scanner.nextInt();
//        short short1 = scanner.nextShort();
//        long long1 = scanner.nextLong();
//
//        System.out.println(bool1);
//        System.out.println(int1);
//        System.out.println(short1);
//        System.out.println(long1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, age and salary:");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
    }
}
