package Day13;

import java.util.Scanner;

public class PracticeScannerLoop {
    public static void main(String[] args) {
        /*
        using scanner, ask user to enter a number, eg: 5
        print:

        5 * 100 = 500
        5 * 102 = 510
        5 * 104 = 520
        ....
        5 * 1000 = 5000
         */

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int p = 100; p <= 1000; p += 2){
            System.out.println(number + " * " + p + " = " + p * number);
        }

        /*
        multiply 2 by 3
        until result is less than 500

        The value of num is: 2
        The value of num is: 6
        The value of num is: 18
        The value of num is: 54
        The value of num is: 162
        The value of num is: ....
         */

        for (int num = 2; num <= 500; num *= 3){
            System.out.println("The value of num is: " + num);
        }













    }
}
