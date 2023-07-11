package Day21Methods;

import java.util.Scanner;

//Plan:
//
//        1) What is a method?
//        --- METHOD runs ONLY WHEN YOU CALL IT ---
//
//        * A method is block of code which only runs when you call it
//        * You can pass some data to a method - PARAMETER
//        * Methods are used to perform some certain task
//
//        2) Why we use methods?
//        * code readability
//        * code reusability
//        * ability to break down a big task into small parts
//
//        3) Method parts?
//        * public -> it makes your method visible in every place of
//        your project
//
//        * void -> it performs some task but doesn't return data
//
//        * returnning type String, int -> it performs some task
//        and returns data as well
//
//        * if a method is returning method then there must be
//        RETURN keyword
//
//        4) Method creation
//public static void methodName(){}
//public static String methodName(){}
//public static int methodName(int a, int b, int c, int[] array){}
//public static void methodName(int a, String str){}
//
//        5) A single block of code VS Method -> covered
//
//        Problem:
//
//        1: Easy
//        Write a method that takes 3 int numbers using Scanner and gives
//        prints their sum;
//        Input: 3
//        Input: 6
//        Input: 19
//        Output: 28
//
//        2: Easy
//        Write a method that takes 3 int numbers using Scanner
//        and gives as parameters and returns their average as double.
//        Input: 4
//        Input: 7
//        Input: 5
//        Output: Average is 5.3 approx
//
//        3:
//        Write a program that takes from keyboard
//        String str and counts number of digits in str
//        and prints it;
//        use Character.isDigit()
//        Input: hello batch3 today is 11th of July
//        Output: 3





public class SessionProblems2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("There are " + countDigits(str) + " digits");;
        String str2 = scanner.nextLine();
        System.out.println(countDigits(str2));
    }
    public static int countDigits(String str){
        int counter = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}
