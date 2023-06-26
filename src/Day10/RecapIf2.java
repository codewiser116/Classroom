package Day10;

import java.util.Scanner;

public class RecapIf2 {
    public static void main(String[] args) {
        // if if if if
        // if, else if, else if, else
        Scanner scanner = new Scanner(System.in);
//        1.
//        String password = scanner.nextLine();
//        // 1st level - 4 letters
//        // 2nd level - 6 letters
//        // 3rd level - 10 letters
//        // ! -> doesn't contain then its not good password
//
//        if(password.length()<4){
//            System.out.println("Your password is too short: "+password.length());
//        }
//        if(!password.contains("!")){
//            System.out.println("Password doesn't contain '!'");
//        }
//        else if(password.length()>=10){
//            System.out.println("3rd level password");
//        }
//        else if(password.length()>=6){
//            System.out.println("2nd level");
//        }
//        else if(password.length()>=4){
//            System.out.println("1st level");
//        }


        // 59
        // 59 / 10 = 5
        // 59 % 10 = 9
        // 2.
//        int number = scanner.nextInt();
//        int sumOfDigits = (number / 10) + (number % 10);
//        boolean b2 = sumOfDigits % 2 == 0;
//
//        if (number % 2 == 0 && b2) {
//            System.out.println("This is double even number!");
//        } else {
//            System.out.println("This is not double even number");
//        }
        // 3.
//        int students = scanner.nextInt();
//        int chairs = scanner.nextInt();
//        if(students>chairs){
//            System.out.println(students-chairs + " students don't have chairs");
//        }
//        else if(chairs>students){
//            System.out.println(chairs - students +" extra chairs");
//        }
//        else{
//            System.out.println("There are enough chairs");
//        }
        // 4. Write a program that asks user to enter boolean talking, int hour
        //* hours can be from 0 - 23
        //
        //* We are in trouble if the parrot is talking and the hour is before 7 or after 20
        //return true
        boolean talking = scanner.nextBoolean();
        int hour = scanner.nextInt();
        System.out.println(talking + " "+ hour);
        if(hour < 0 || hour > 23){
            System.out.println("You entered wrong hours");
        }
        else if(talking && (hour < 7 || hour > 20)){
            System.out.println("We are in trouble");
        }
        else{
            System.out.println("we are not in trouble");
        }
    }
}
