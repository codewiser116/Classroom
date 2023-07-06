package Day18;

import java.util.Arrays;

public class ArraySizes {




    public static void main(String[] args) {

        /*
        Array is a fixed size collection. Once the size is given, it cannot be changed
         If you want to create array, but don't give the values yet, you
         must mention the size of it
         */

        String [] countries = new String[5];
        countries[0] = "Brazil";
        countries[1] = "Australia";
        countries[2] = "Sweden";
        countries[3] = "Belarus";
        countries[4] = "South Korea";

        String countries2 [] = new String[2];
        countries2[0] = "Switzerland";
        countries2[1] = "Italy";

        // if i want to change the size of array to 1
        countries2 = new String[]{"Laos"};


        String [] berries = new String[10];
        System.out.println(Arrays.toString(berries));

        berries[0] = "strawberry";
        System.out.println(Arrays.toString(berries));

        berries[9] = "cherry";
        berries[8] = "cherry";
        berries[7] = "cherry";
        System.out.println(Arrays.toString(berries));

        berries[7] = null;
        System.out.println(Arrays.toString(berries));

//===================================

        float [] degrees = new float[3];
        System.out.println(Arrays.toString(degrees));

        degrees[0] = 101.4f;
        System.out.println(Arrays.toString(degrees));

        degrees[degrees.length - 1] = 100.7F;
        System.out.println(Arrays.toString(degrees));

        String strDegrees = Arrays.toString(degrees);

//        ===================================

        String [] names1 = {"John", "Jack", "Rosa"};
        System.out.println("Names1: " + Arrays.toString(names1));

        String [] names2 = names1;
        System.out.println("Names2: " + Arrays.toString(names2));

        names1[0] = "Mike";
        names1[1] = "Bena";
        names1[2] = "Uluk";
        System.out.println("Names2: " + Arrays.toString(names2));


































    }
}
