package Day13;

import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {


       /*
       start: 1
       end: ask user to enter any number

       print all numbers from 1 until given number
       print sum of all those numbers

       1
       2
       3
       4
       5
       sum: 15
        */

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= limit; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println("sum: " + sum);


        /*
        5
            1
            2
            3
            4
            5
            multiplication: 120
         */


        int multiplicationResult = 1;
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++){
            System.out.println(i);
            multiplicationResult *= i;
        }
        System.out.println("multiplication: " + multiplicationResult);




    }
}
