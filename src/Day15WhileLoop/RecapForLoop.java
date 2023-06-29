package Day15WhileLoop;

import java.util.Scanner;

public class RecapForLoop {
    public static void main(String[] args) {

        /*
        print 1 to 100
        using for loop

        scope / limit /barrier
         */


        for (int i = 1; i <= 100; i = i + 1){
            System.out.println(i);
        }

        /*

        algorithm / pseudocode
        step-by-step instructions on how to resolve a problem

        Given: we have string1 and string2
        Find: how many times string2 appears in string1
        --------------------------
                       0 1 2 3 4 5 6 7  8  9 10 11 12 13 14
        String str1 = "c o d i n g i s  c  o  d  i  n g but not code";
        String str2 = "cod" => 3

        str1.substring(0,3) ==> cod
        str1.substring(1,4) ==> odi
        str1.substring(2,5) ==> din
        str1.substring(3,6) ==> din

        BREAK UNTIL 10:53


        Pseudocode:

        1. create int counter (store the number of occurences)
        2. create for loop to loop thru str1
        3. inside for loop, substring every possible combination of str2.length()
        4. inside for loop, if (combination = str2) counter++, else skip
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second word:");
        String str2 = scanner.nextLine();

        int counter = 0;

        /*
        String str1 = "coding"; => 6
        String str2 = "cod" => 3
         */
        for (int i = 0; i <= str1.length() - str2.length(); i++){
            String s1 = str1.substring(i, i + str2.length());

            if (str1.substring(i, i + str2.length()).equals(str2)){
                counter++;
            }

        }
        System.out.println("Occurences: " + counter);











    }
}
