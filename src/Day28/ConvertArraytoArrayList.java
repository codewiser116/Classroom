package Day28;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoArrayList {
    public static void main(String[] args) {

        String [] arrayOfColors = new String[]{"red", "green", "yellow", "blue"};

        // convert array to arraylist
        ArrayList<String> listOfColors = new ArrayList<>(Arrays.asList(arrayOfColors));

        System.out.println(listOfColors.size());

        System.out.println(listOfColors);
        System.out.println(Arrays.toString(arrayOfColors));

        /*
        Create array of integers with 5 elements
        convert to arraylist of integers
        delete first and last elements
        print the arraylist and array and their sizes
         */

        Integer [] arrayOfInts = new Integer[] {1,2,3,4,5};
        ArrayList<Integer> listOfInts = new ArrayList<>(Arrays.asList(arrayOfInts));
        listOfInts.remove(0);
        listOfInts.remove(listOfInts.size() - 1);

        System.out.println(arrayOfInts.length);
        System.out.println(Arrays.toString(arrayOfInts));

        System.out.println(listOfInts.size());
        System.out.println(listOfInts);

        /*
        How to convert ArrayList to array
         */

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(1.2);
        prices.add(2.3);
        prices.add(1.11);
        prices.add(0.0);

        Double [] arrayOfPrices = new Double[prices.size()];
        prices.toArray(arrayOfPrices);

        System.out.println(Arrays.toString(arrayOfPrices));


    }
}
