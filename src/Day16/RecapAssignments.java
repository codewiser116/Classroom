package Day16;

import java.util.Random;
import java.util.Scanner;

public class RecapAssignments {
    // 10 - is not a prime number

    // 10/i +
    // 10/i -
    // 10/i -
    // 10/i +
    // 10/6 -
    // 10/7 -
    // 10/8 -
    // 10/9 -
    public static void main(String[] args) {
//        int number = 12, counter = 0;
//        for(int i = 1; i <= number; i++){
//            if(number%i==0){
//                counter++;
//            }
//        }
//        if(counter==2){
//            System.out.println("IT is a prime nuber");
//        }
//        else{
//            System.out.println(counter);
//            System.out.println("It is not a prime number");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int evens = 0, odds = 0;
//        for(int i = 1; i <= 5; i++){
//            int  number = scanner.nextInt();
//            if(number % 2 == 0){
//                evens++;
//            }
//            else{
//                odds++;
//            }
//        }
//        System.out.println(odds + "odds, "  + evens + " evens");

//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int number = scanner.nextInt();
//        counter++;
//        while(number<999){
//            System.out.println("Try again!");
//            number = scanner.nextInt();
//            counter++;
//        }
//        System.out.println("It took you "+ counter +" time(s) to enter 999!");
        Scanner scanner = new Scanner(System.in);
//        int i = 4;
//        int number = scanner.nextInt();
//        String strNumber = String.valueOf(number);
//        while(i>=0){
//            System.out.print(strNumber.charAt(i));
//            i--;
//        }

        int i = 1;
        int winters = 0, springs = 0, summers = 0, autumns = 0;
        while(i<=5){
            String monthOfBirth = scanner.nextLine();
            if(monthOfBirth.equalsIgnoreCase("September") || monthOfBirth.equalsIgnoreCase("October")
            || monthOfBirth.equalsIgnoreCase("November")){
                autumns++;
            }
            else if(monthOfBirth.equalsIgnoreCase("December") || monthOfBirth.equalsIgnoreCase("January")
            || monthOfBirth.equalsIgnoreCase("February")){
                winters++;
            }
            else if(monthOfBirth.equalsIgnoreCase("March") || monthOfBirth.equalsIgnoreCase("April")
            || monthOfBirth.equalsIgnoreCase("May")){
                springs++;
            }
            else if(monthOfBirth.equalsIgnoreCase("June") || monthOfBirth.equalsIgnoreCase("July")
            || monthOfBirth.equalsIgnoreCase("August")){
                summers++;
            }
            else{
                System.out.println("Wrong month!");
            }
            i++;
        }
        System.out.println("Winters = "+winters+", Springs = "+springs +", Summers = "+ summers + " Autumns = "+autumns);
    }
}
