package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class Session2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter your number at index " + i);
            array[i] = scanner.nextInt();
        }

    }
}
