package Day32;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int balance = 30;
//        int day = scanner.nextInt();
//        if(day == 1){
//            System.out.println("Monday");
//        }
//        else if(day == 2) {
//            System.out.println("Tuesday");
//        }
//        else if(day == 3) {
//            System.out.println("Wednesday");
//        }
//        else if(day == 4) {
//            System.out.println("Thursday");
//        }
//        else if(day == 5) {
//            System.out.println("Friday");
//        }
//        else if(day == 6) {
//            System.out.println("Saturday");
//        }
//        else if(day == 7) {
//            System.out.println("SUnday");
//        }
//        else{
//            System.out.println("Wrong day");
//        }
//        switch (password.length()){
//            case 5,6,7,8,9,10 -> {
//                System.out.println("level 1");
//            }
//            case 11,12,13,14,15 -> {
//                System.out.println("level 2");
//            }
//            default -> {
//                System.out.println("Invalid level");
//            }
//        }
//        switch(day){
//            case 1,2,3 -> {
//                balance-=30;
//                System.out.println("Day "+ day+"," + balance +" $ left");
//            }
//            case 4 -> {
//                balance-=25;
//                System.out.println("Day "+ day+"," + balance +" $ left");
//            }
//            case 5 -> {
//                balance-=20;
//                System.out.println("Day "+ day +"," + balance +" $ left");
//            }
//            case 6,7 ->{
//                balance-=10;
//                System.out.println("Day "+ day +"," + balance +" $ left");
//            }
//            default ->{
//                System.out.println("Invalid day");
//            }
//        }
        int number = scanner.nextInt();
        HashMap<String,Double> fruits = new HashMap<>();
        fruits.put("apple",1.0);
        fruits.put("pineapple",2.0);
        fruits.put("cherry",3.0);
        fruits.put("watermelon",4.0);
        switch (number){
            case 1 ->{
                for(String i: fruits.keySet()){
                    System.out.println(i);
                }
            }
            case 2 -> {
                for(Double i: fruits.values()){
                    System.out.println(i);
                }
            }
            case 3 -> {
                for(Map.Entry<String, Double> e: fruits.entrySet()){
                    System.out.println(e.getKey() + " " + e.getValue());
                }
            }
            case 4 -> {
                System.out.println(fruits);
            }
            default -> {
                System.out.println("Invalid option");
            }
        }
    }
}
