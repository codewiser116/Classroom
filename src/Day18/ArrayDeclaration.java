package Day18;

public class ArrayDeclaration {
    public static void main(String[] args) {

        // 1. First way to create array, makes sure new object is created
        String [] array1 = new String[]{"hello", "bye-bye"};

        // 2. Second way to create array, most common version
        String [] array2 = {"hello", "bye-bye"};

        // 3. Third way to create array, less common version
        String array3 [] = {"hello", "bye-bye"};


        /*
        Home assignment:
        1. create 9 String arrays: 3 of them in first way
                                    3 of them in second way
                                    3 of them in third way
       2. create 9 int arrays
       3. create 9 char arrays
       4. create 9 boolean arrays
         */

        // declare/create array
        int [] ages1;

        // initialize array
        ages1 = new int []{9,8,7};

        // declare and initialize array
        int [] ages2 = {1,2,3};

        // reassign the values to array
        ages2[0] = 9;
        ages2[1] = 90;
        ages2[2] = 900;


        String cities [] = {"Barcelona", "Milan", "Moscow"};
        System.out.println("Number of cities: " + cities.length); //3

        double temps [] = {20, 34.7, 44, 12.8};
        System.out.println("Temps: " + temps.length); //4

        boolean [] sales  = {true, false, false, true, true};
        System.out.println(sales.length); //5

        //create your own char, short arrays and print sizes











    }
}
