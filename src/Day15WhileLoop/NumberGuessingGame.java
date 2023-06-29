package Day15WhileLoop;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        /*
        Keep asking user to enter any number from 1 to 10
        until user guesses the right number

        Pseudocode:
        1. create Scanner
        2. create do while loop, ask user to guess number from 1 to 10
        3. in while condition, check if guessedNumber == number
         */
        int number = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");
        int guessedNumber = scanner.nextInt();

        while (guessedNumber != number){
            System.out.println("Guess the number");
            guessedNumber = scanner.nextInt();
        }

        System.out.println("Congratulations! You got it");








//        do {
//            System.out.println("Guess the number from 1 to 10:");
//            guessedNumber = scanner.nextInt();
//        }while(number != guessedNumber);
//
//        System.out.println("Congratulations! You got the number!");

//        ==================================


//        while()




    }
}
