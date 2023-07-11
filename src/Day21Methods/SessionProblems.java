package Day21Methods;

import java.util.Scanner;

public class SessionProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(average(a, b, c));
    }

    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1+num2+num3);
    }

    public static double average(int a, int b, int c){
        double average = (double)(a+b+c)/3;
        return average;
    }



}
