package Day20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RecapPart {
    public static void main(String[] args) {
        // iterate over array, print values in new lines
        // fill in array using scanner
        // fill in array using random numbers
        // Array manipulation: update values

        // Arrays.toString()
        // Arrays.copyOf()
        // someArray.clone()
        // Arrays.sort()
        // Arrays.equals
        // Arrays.fill
//        int[] array = new int[]{1,2,3,4,5,10,22};
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i]+ " ");
//        }
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        int[] array = new int[20];
//        for(int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(10,20);
//        }
//        System.out.println(Arrays.toString(array));
//        int[] array = {1,2,3,12,4,5,13,15,6};
//        // 1, 2, 3, 0, 4, 5, 0, 0, 6
//        for(int i = 0; i < array.length; i++){
//            if(array[i]>10){
//                array[i] = 0;
//            }
//            else if(array[i]<6){
//                array[i] = 5;
//            }
//        }
//        System.out.println(Arrays.toString(array));
        int[] array = {1,2,3,12,4,5,99,15,6, 99, 99};
        for(int i = 0; i < array.length; i++){
            if(array[i]==99){
                System.out.println("Good luck!");
            }
        }

    }
}
