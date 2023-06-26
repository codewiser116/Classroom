package Day13;

import java.util.Scanner;

public class IntroToLoops {
    public static void main(String[] args) {
        /*
        2 * 1 = 2
        2 * 2 = 4
        2 * 3 = 6
        ...
        2 * 10 = 20
         */

        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + 2 * i);
        }



        for (int a = 100 - 90 + 5; a < 20; a++){
            System.out.println("Java is fun");
        }

        for(byte i = 10; i > 0; i--){
            System.out.println("The value of x is: " + i);
        }

        for (int i = 1; i <= 100; i+=2){
            System.out.println(i);
        }

        /*
        print numbers from 0 to 30
        0
        3
        6
        9
        12
        ...
        30

        e = e + 3;
        e += 3; shortcut
        ------------
        a = a * 5;
        a *= 5;
        ------------
        a = a % 2;
        a %= 2;


         */




        for (int e = 0; e <= 30; e+=3){
            System.out.println(e);
        }


        int b = 10;

        for (; b >= 0; ){
            System.out.println("The value of b: " + b);
            b-=2;
        }

        /*

        Using scanner ask for number from user
        int number = scanner.nextInt(); // 4

        4 * 0 = 0
        4 * 5 = 20
        4 * 10 = 40
        4 * 15 = 60
        ...
        4 * 100 = 400

         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i <= 100; i+=5){
            System.out.println(number + " * " + i + " = " + i * number);
        }



    }
}
