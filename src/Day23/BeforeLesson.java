package Day23;

import java.util.Arrays;
import java.util.Random;

public class BeforeLesson {
    //1. Let's create a method that takes an empty array with size 10
    //and fills it with random numbers and returns
    //array.
    //
    //2. Create a second method that takes filled array
    //and assigns to elements less than 10 value 0 and return array.
    //
    //3. Create a main method that calls these 2 methods and prints the array
    //in the main method.
    //
    //If your array is {1, 534, 543534, 8543534, 12, 99, 543, 11, 98, 5}
    //Output: 0, 534, 543534, 8543534, 12, 99, 543, 11, 98, 0

    public static void main(String[] args) {
        int[] array = { -5, -10, -999, -55};
        System.out.println(Arrays.toString(findMaxMin(array)));
    }

//    public static int[] fillArray(int[] array){
//        Random random = new Random();
//        for(int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(1,15);
//        }
//        return array;
//    }
//
//    public static int[] changeValue(int[] filledArray){
//        for(int i = 0; i < filledArray.length; i++){
//            if(filledArray[i] < 10){
//                filledArray[i] = 0;
//            }
//        }
//        return filledArray;
//    }

    public static int[] findMaxMin(int[] array){

        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        int[] maxAndMin = new int[2];
        maxAndMin[0] = max;
        maxAndMin[1] = min;

        return maxAndMin;
    }


}
