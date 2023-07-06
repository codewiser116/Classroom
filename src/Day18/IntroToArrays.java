package Day18;

import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {

        String [] fruits = {"apple", "banana", "orange", "kiwi"};
        int [] numbers = {2, 7, 1, 235, 246};
        double [] prices = {5.99, 2.49, 3.0, 2.99};
        boolean [] isDiscounted = {true, true, true, true, false};

        //declaring and initializing array
        char [] letters = {'h', 'e', 'l', 'l', 'o'};

        //reassigning new values
        letters = new char [] {'b', 'y', 'e'};



    /*
    Create byte array, short array, int array, long array
    float array, double array, boolean array
    char array,
    String array
     */

        //HOW TO READ VALUES
        String [] products = {"shampoo", "conditioner", "hair mask"};

        System.out.println(products[0]);

        String str = products[1];
        System.out.println(str);

        products[2] = "balm";

//        ====================================

        short [] digits = {1, 5, 10, 15, 20};
        digits[2] = 100;

        System.out.println(digits);
        System.out.println(Arrays.toString(digits)); //to print array

        digits[4] = 200;
        digits[0] = 100;
        digits[1] = 500;
        System.out.println(Arrays.toString(digits));










    }
}
