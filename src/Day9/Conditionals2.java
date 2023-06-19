package Day9;

import java.util.Scanner;

public class Conditionals2 {
    public static void main(String[] args) {
        // Exercise
        // 1. Write a program that asks user to enter a word and number
        // Check if word's length is greater than number
        // Input: calculationss
        // Input: 12
        // Output: true
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = scanner.nextInt();

        if(word.length() > number){
            System.out.println("TRUE, its length is greater");
        }
        else{
            System.out.println("FALSE ");
        }

    }
}
