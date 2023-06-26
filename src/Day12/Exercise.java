package Day12;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte month = 4;
        // 12, 1,2 -> Winter
        // 3,4,5 ->Spring
        // 6,7,8 -> Summer
        // 9,10,11 -> Fall
//        if(month == 12 || month == 1 || month == 2){
//            System.out.println("Winter");
//        }
//        else if(month == 3 || month == 4 || month == 5){
//            System.out.println("Spring");
//        }
//        else if (month == 6 || month == 7 || month == 8){
//            System.out.println("Summer");
//        }
//        else if (month == 9 || month == 10 || month == 11){
//            System.out.println("Fall");
//        }
//        else{
//            System.out.println("Wrong month");
//        }
//
//        int number = scanner.nextInt();
//        if(number % 3 == 0 && number % 5 == 0){
//            System.out.println("Multiple of 3 and 5");
//        }
//        else if(number % 3 == 0 || number % 5 == 0){
//            System.out.println("Multiple of 3 or 5");
//        }
//        else{
//            System.out.println("It is not their multiple");
//        }
//        String typeOfStudent = "online";
//        String advantage = "not following";
//
//        if(typeOfStudent.equals("online")){
//            System.out.println("You r online student");
//            if(advantage.equals("following")){
//                System.out.println("Cool, u have 2nd monitor");
//            }
//        }
//        else if(typeOfStudent.equals("offline")){
//            System.out.println("You r offline students");
//            if(advantage.equals("following")){
//                System.out.println("Cool, u come in person!");
//            }
//        }
//        String profession = "Programmer";
//        String skills = "Java, Python, Knows how to make people laugh, Types fast";
//        if(profession.equals("Programmer")){
//            System.out.println("---You r a programmer---");
//            if(skills.contains("Java")){
//                System.out.println("Cool, u know java");
//            }
//            if(skills.contains("Python")){
//                System.out.println("Cool, u know python");
//            }
//            else if(skills.contains("Knows how to make people laugh")){
//                System.out.println("+10 k to salary");
//            }
//            else if(skills.contains("Types fast")){
//                System.out.println("Cool, u can think and type faster");
//            }
//        }
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println("Number1, IF "+number1 + " " + number2 + " " + number3);
            }
            else if(number3 > number2){
                System.out.println("Number1, ELSE-IF "+number1 + " " + number3 + " " + number2);
            }
        }
        else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println("Number2, IF "+ number2 + " "+ number1 + " " + number3);
            }
            else if(number3 > number1){
                System.out.println("Number2 ELSE-IF" + number2 + " " + number3 + " " + number1);
            }
        }
        else if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.println("Number3 IF " + number3 + " " + number1 + " " + number2);
            }
            else if(number2 > number1){
                System.out.println("Number3 ELSE-IF " + number3 + " " + number2 + " " + number1);
            }
        }
    }
}
