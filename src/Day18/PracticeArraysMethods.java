package Day18;

import java.util.Arrays;
import java.util.Collections;

public class PracticeArraysMethods {
    public static void main(String[] args) {

        int [] numbers = {5, 8, -2, 100, 0, 23};
        System.out.println("Before sort: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("After sort: " + Arrays.toString(numbers));

        // Strings are sorted from a to z

        String [] foods = {"lasagna", "pizza", "Pasta", "oromo"};
        System.out.println("Before sort: " + Arrays.toString(foods));

        Arrays.sort(foods);
        System.out.println("After sort, ascending order: " + Arrays.toString(foods));

        //HOW TO SORT IN DESCENDING ORDER?
        Arrays.sort(foods, Collections.reverseOrder());
        System.out.println("After sort, descending order: " + Arrays.toString(foods));

        /*
        Collections.reverseOrder() only works with object data types,
        not with primitives

        Wrapper classes - are object representations of primitives
        int -> Integer
        short -> Short
        byte -> Byte
        long -> Long
        double -> Double
        float -> Float
        boolean -> Boolean
        char -> Character
         */

        int [] array1 = {1,2,3};
        int [] array2 = {1,3,2};

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println(isEqual);

        System.out.println(Arrays.equals(new int[]{1,2,3}, new int[]{1,2,3}));







    }
}
