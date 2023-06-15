package Day7;

import java.util.Scanner;

public class ComparingString2 {
    public static void main(String[] args) {
        String str1 = "USA";
        String str2 = "USA1";
        String str3 = new String("USA");

        boolean bool;
        // here both str1 and str2 point to the same object in String pool
        bool = str1 == str2; // false
        System.out.println(bool);

        // compares values
        bool = str1.equals(str2); // false
        System.out.println(bool);

        // str1 points to the object in String pool
        // str3 points to the object in Heap memory
        // both of them point to the different object
        bool = str1 == str3; // false
        System.out.println(bool);

        // it compares values
        bool = str1.equals(str3); // true
        System.out.println(bool);

    }
}
