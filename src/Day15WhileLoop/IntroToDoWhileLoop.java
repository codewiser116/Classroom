package Day15WhileLoop;

import java.util.Scanner;

public class IntroToDoWhileLoop {
    public static void main(String[] args) {

        //print numbers from 1 to 10 using while loop
        int a = 1;
        while (a >= 10){
            System.out.println("while " + a);
            a++;
        }

        //print numbers from 1 to 10 using do while loop
        int b = 1;
        do {
            System.out.println("do while: " + b);
            b++;
        }while (b >= 10);

        /*

        while loop:
            1. condition is checked
            2. code is executed

        do while loop:
            1. code is executed
            2. condition is checked

        In while loop: the code gets executed only if condition is true
        In do while loop: the code gets executed at least once, even if condition is false
         */


        /*
        write a program, ask user to enter name
        and print "hello <name>"
        keep printing "hello <name>" until user enters "stop"

        Pseudocode:
        1. create Scanner, get String name from user
        2.
        3. create loop:
            print "hello name"
            get String word2 from user
        4. using if else, check if word2.equals("stop")
        5. if false, print "hello name", else exit
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        String word;

        do {
            System.out.println("Hello " + name);
            System.out.println("Enter any word: ");
            word = scanner.nextLine();
        }while (!word.equalsIgnoreCase("stop"));


























    }
}
