package Day19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProblemSet {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        // 1 2 3 4 5 6 7 8 9 10
//        // 0 1 2 3 4
//
//        // 2 and 4 elements -> divisible by 2, print them multiplied by 2
//        System.out.print("? ");
//        for(int i = 0; i < array.length; i++){
//            if(array[i] % 2 == 0){
//                System.out.print(array[i] *2 +" ");
//            }
//            else{
//                System.out.print(array[i]+ " ");
//            }
//        }
//        System.out.print("?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        System.out.println("Enter size of array");
//        int[] intArray = new int[25];
//
//        System.out.println(Arrays.toString(intArray));
//        for(int i = 0; i < intArray.length; i++){
//            intArray[i] = random.nextInt(20, 29);
//        }
//        System.out.println(Arrays.toString(intArray));

//        int size = scanner.nextInt();
//        int[] array = new int[size];
//
//        int counterLess500 = 0, counterGROREQ500 = 0;
//        for(int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(100,1000);
//            if(array[i]<500){
//                counterLess500++;
//            }
//            else{
//                counterGROREQ500++;
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(counterLess500+" are less than 500");
//        System.out.println(counterGROREQ500+" are greater than or equal to 500");

        int[] array = new int[6];

        for(int i = 0; i < array.length; i++){
            System.out.println("HI, I am generating random number");
            array[i] = random.nextInt(100,1000);
        }

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            if(array[i]<500){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i]>=500){
                System.out.print(array[i]+" ");
            }
        }

//        for -> for numbers less than 500
//        for -> for numbers greater than or equal to 500

        // Hint: 2 more loops
        // {452, 992, 123, 953, 500, 498, 235}
        // 1st line: 992, 953, 400, 500
        // 2nd line: 452, 123, 498, 235


    }
}
