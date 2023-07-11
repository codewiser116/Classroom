package Day21Methods;

import java.util.Scanner;

public class Session {
    public static void main(String[] args) {
        int sum = sumOfTwo(5, 10);

        System.out.println(sum);

        sumOfTwo2(5,10,15);
    }

    public static int sumOfTwo(int num1, int num2){
        System.out.println((num1+num2)+ " sum");
        return num1 + num2;
    }

    public static void sumOfTwo2(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }
}
