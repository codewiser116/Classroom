package Day6;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Waiting for your firstname: ");
//        String name = s.nextLine();
//
//        System.out.println("Waiting for your surname:");
//        String surname = s.nextLine();
//
//        System.out.println(name + " " + surname + " have a productive day!");

//        int number1 = s.nextInt();
//        int number2 = s.nextInt();
//        System.out.println(number1);
//        System.out.println(number2);

//        String firstName = s.nextLine();
//        String country = s.nextLine();
//        String profession = s.nextLine();
//        double salary = s.nextDouble();
//        System.out.println(firstName + ", " + country + ", " + profession
//         + ", " + salary);

//        System.out.print("Enter your first number: ");
//        double number1 = sc.nextDouble();
//
//        System.out.print("Enter your second number: ");
//        double number2 = sc.nextDouble();
//
//        System.out.print("Enter your third number: ");
//        double number3 = sc.nextDouble();
//
//        double result = number1 + number2 * number3;
//        System.out.println(number1 + " + " + number2 + " * " + number3 + " = " + result);

        System.out.print("Enter your 3-digit number: ");
        // 243 / 100 = 2
        //243 / 10 % 10 = 4
        // 243 % 10 = 3
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        System.out.println(firstDigit + ", " + secondDigit + ", " + lastDigit);
    }
}
