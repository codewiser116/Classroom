package Day7;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // 1.
        // Problem: Write a program that asks a user to enter a word
        // print the first character of the word
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word = scanner.nextLine();
//        System.out.println(word.charAt(4)); // print first character

        // 2.
        // Problem: Write a program that asks a user to enter a word
        // print the 5th character of the word
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word = scanner.nextLine();
//        System.out.println(word.charAt(4)); // print fifth character

        // 3.
        // Problem: Write a program that asks a user to enter 2 variable words
        // check if 2nd word occurs inside 1st word, print false or true
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 1st word: ");
//        String word1 = scanner.nextLine();
//        System.out.println("Enter 2nd word: ");
//        String word2 = scanner.nextLine();
//        System.out.println(word1.contains(word2));

        // 4.
        // Problem: Write a program that asks user to enter a word
        // print the word all in Upper Case
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your word:");
//        String word = scanner.nextLine();
//        System.out.println(word.toUpperCase());

        // 5.
        // Problem: Write a program that asks user to enter a word
        // save replaced all  "e" to "Codewise"
        // save replaced all "a" to "Batch3"
        // print the changed result

        // "It never makes me"
        // Expected output: It nCodewisevCodewiser mBatch3kCodewises mCodewise
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your word: ");
//        String word = scanner.nextLine();
//        word = word.replace("e","Codewise");
//        word = word.replace("a","Batch3");
//        System.out.println(word);

        // 6.
        // Problem: Write a program that asks user to enter a word
        // print last 4 letters using some String method
        // It never makes me boring
        // Expected output: ring
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();
        int length = word.length();
        System.out.println(word.substring(length-4));
    }
}
