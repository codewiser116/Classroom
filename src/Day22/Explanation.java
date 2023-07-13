package Day22;

import java.util.Random;

public class Explanation {
    public static void main(String[] args) {
       int[] array1 = new int[10];
       int[] array2 = new int[15];
       int[] array3 = new int[25];
       int[] array4 = new int[10000];
        arrayFillPrint(array1);
        arrayFillPrint(array2);
        arrayFillPrint(array3);
        arrayFillPrint(array4);
    }
    public static void arrayFillPrint(int[] variable){
        Random random2 = new Random();
        for(int i = 0; i < variable.length; i++){
            variable[i] = random2.nextInt(100);
            System.out.println(variable[i]);
        }

        System.out.println();
    }

}


