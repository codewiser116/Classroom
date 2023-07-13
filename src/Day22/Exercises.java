package Day22;

import java.util.Scanner;

public class Exercises {

    // 1. Write a program that takes from user some word
    //and write a method that takes as a parameter String
    //and prints it without 1st and last symbols.
    //Input: hello
    //Output: ell
    //Input: Batch13
    //Output atch1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
//        printString(word);
//        printReplaced(word);
        System.out.println(validatePassword(word));
    }

    public static void printString(String word){
        System.out.println(word.substring(1,word.length()-1));
    }

    public static void printReplaced(String word){
        System.out.println(word.replace("e",""));
    }

    public static boolean validatePassword(String password){
        if(password.length()>10 && password.contains("@")){
            return true;
        }
        else{
            return false;
        }
    }



}
