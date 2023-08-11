package Day40;

import Day40.animals.Animal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int a = 50, b = 70, c;
//        c = a > b ? a : b;
//        System.out.println(c);
        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        String answer = age > 19 ? "Adult" : "Teen";
//        System.out.println(answer);

        int a = 10, b = 10, c = 10;
        int maximumNum = (a > b && b > c) ? a : (b > a && b > c) ? b : (c > b && c > a) ?  c : a;

        System.out.println(maximumNum);



    }
}
