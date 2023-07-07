package Day19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Classroom1 {
    public static void main(String[] args) {
        // old style
        String car1 = "BMW";
        String car2 = "Mercedes";
        String car3 = "Toyota";
        String car4 = "Chevrolet";

        // new style -> Arrays
        String[] cars = {"BMW","Mercedes","Toyota","Chevrolet"};


        // Ways of declaration of arrays
        // 1 -> not initialized
        String[] array;
        // 2 -> initialized, it is empty, it stores nulls by default
        String[] arrays = new String[10];
        arrays[0] = "HI";
        arrays[1] ="Five";
        // 3 -> initialized and assigned values
        String[] arrays2 = new String[]{"HI","Five","ME"};
        // 4 -> initialized and assigned values
        String[] arrays3 = {"HI", "Five", "ME"};
        int[] intArray = {1,53,-6,43,999};
        //* Arrays.equals(array1, array2) -> compare arrays
        //* Arrays.sort(array1) -> sort this array
        //* somearray.clone() -> it will return the copy of array
        //* Arrays.copyOf(somearray,somearray.length)
        //* somearray.length
        //* Arrays.toString()
        //* Arrays.fill(someArray, 100) -> assign all values to 100
        System.out.println(Arrays.equals(arrays2, arrays3));

        Arrays.sort(arrays2, Collections.reverseOrder());
        Arrays.sort(intArray);

        System.out.println("Reference for array2 "+arrays2);
        System.out.println("Reference for array3 "+arrays3);

//        String[] array4 = Arrays.copyOf(arrays3, arrays3.length);
        String[] array4 = arrays3.clone();
        System.out.println("Reference for array4 "+array4);
        array4[0]="HELLO";
        arrays3[2]="BATCH3";
        System.out.println("VALUES array 3: "+Arrays.toString(arrays3));
        System.out.println("VALUES array 4: "+Arrays.toString(array4));
        System.out.println(Arrays.toString(arrays3));

        String[] stringArray = new String[20];
        System.out.println(Arrays.toString(stringArray));

        Arrays.fill(stringArray, "HI");
        stringArray[1] = "HELLO";
        System.out.println(Arrays.toString(stringArray));

    }
}
