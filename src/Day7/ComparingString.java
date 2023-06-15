package Day7;

import java.util.Scanner;

public class ComparingString {
    int a = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // They both point to the same object in String pool
        // We have one object in String pool value = Aidana
        String word1 = "Aidana";
        String word2 = "Aidana";

        // Both point to the different objects in String pool
        // We have 2 objects in String pool 1st Joe, 2nd Joe
        word2 = "Joe";





        // We have only one thing in String pool
        String str = "Batch3";
        // it creates one more object in String pool
        // We have 2 object in String pool
        // String Pool { Batch3, Batch3Graduates }
        str = "Batch3 Graduates";







        // It is created outside of the String Pool
        // It is created in Heap memory
        // It creates 2 different objects in Heap memory, outside of the String pool
        String str1 = new String("Str1");
        String str2 = new String("Str1");

        // Both of them point to the same object in String Pool
        String str3 = "Batch3";
        String str4 = "Batch3";
        // == -> for primitive data types compares values
        // == -> for String, compares its addresses

        // Compare their values not addresses
        System.out.println(str1 == str2); // false
        // Compare their addresses
        System.out.println(str3.equals(str4)); // true

    }
}
