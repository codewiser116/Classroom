package Day9;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
//        // 1.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your login: ");
//        String login = scanner.nextLine();
//
//        System.out.println("Enter your password: ");
//        String password = scanner.nextLine();
//
//        if(login.equals("Codewise22") && password.equals("password112")){
//            System.out.println("Successful login!");
//        }
//        if(!login.equals("Codewise22")){
//            System.out.println("Your email is incorrect");
//        }
//        if(!password.equals("password112")){
//            System.out.println("Your password is incorrect");
//        }
        // 2.
        int age = scanner.nextInt();
        System.out.println(age);
        if(age >= 1 && age <= 3){
            System.out.println("Toddler");
        }
        else if(age >= 4 && age <=5){
            System.out.println("Preschooler");
        }
        else if(age>=6 && age <=12){
            System.out.println("Gradeschooler");
        }
        else if(age>=13 && age <=17){
            System.out.println("Teen");
        }
        else if(age>=18 && age<=135){
            System.out.println("Adult");
        }
        else {
            System.out.println("WRONG AGE");
        }

    }
}
