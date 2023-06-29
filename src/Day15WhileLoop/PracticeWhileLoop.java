package Day15WhileLoop;

import java.util.Scanner;

public class PracticeWhileLoop {

    public static void main(String[] args) {
        int x = 1;
        int sum = 0;

        while (x <= 10){
            sum = sum + x;

            x++;
        }

        System.out.println("Sum: " + sum);



        int a = 100;

        while (a < 111){
            System.out.println("Good morning everyone");
            a++;
        }

        //110


        int word = 0;

        while (word <= 20){
            System.out.println(a); //110
            word++;
        }


        int day = 1;

        while (day < 32) {
            System.out.println(day + " January 2023");
            day++;
        }

        /*
        Ask 2 numbers from user, and print all even numbers in given range
        Example:
        int1 = 10;
        int2 = 5;
        Output: 6,8,10

        Example 2:
        int1 = 100;
        int2 = 300;
        Output: 100, 102, 104

        Pseudocode:
        1. Create Scanner and get 2 numbers from user: int1 and int2
        2. Using if-else, identify which number is smaller
        3. inside if condition, create while loop until we reach the biggest number
        4. inside loop, using if find if number is even and print it
        5. increment while loop

        int1 = get from user
        int2 = get from user

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int int1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int int2 = scanner.nextInt();

        int small = Math.min(int1, int2);
        int big = Math.max(int1, int2);

        while (small <= big) {
            if (small % 2 == 0){
                System.out.println(small);
            }
            small++;
        }







    }
}
