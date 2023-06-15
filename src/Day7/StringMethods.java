package Day7;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "      MACBooKLaptop Batch3     ";

        // 1. String methods doesn't change string itself

        // this return str1 in Lower Case
        System.out.println("result = "+str1.toLowerCase());
        // this return str1 in Upper Case
        System.out.println("result = "+str1.toUpperCase());
        // this return a char located on this index
        System.out.println("result = "+ str1.charAt(2));
        // this return false or true
        System.out.println("result = "+ str1.isEmpty());
        // returns us total number of symbols
        System.out.println("result = "+ str1.length());
        // returns str1 + " Hello "
        System.out.println(str1.concat(" Hello "));
        // returns false or true if variable contains the same string
        System.out.println("result = " + str1.contains("op"));
        // it returns index of first met 3 in string
        System.out.println("3: "+ str1.indexOf("3"));
        // it returns index where Batch3 word starts in string
        System.out.println("Batch3: "+str1.indexOf("Batch3"));
        // it returns index of first met a in string
        System.out.println("a: "+str1.indexOf("a"));
        // it returns -1, because str1 doesn't contain @
        System.out.println("@: "+str1.indexOf("@"));
        // it returns str1 -> old replaced to new
        System.out.println(str1.replace("3", "kk"));
        // it returns str1 itself, because we don't have @@@ in str1
        System.out.println(str1.replace("@@@", "kk"));
        System.out.println(str1.startsWith("M")); // true
        System.out.println(str1.startsWith("@")); // false
        System.out.println(str1.startsWith("MAC")); // true

        System.out.println(str1.endsWith("Batch3")); // true
        System.out.println(str1.endsWith("MAC")); // false
        System.out.println(str1.endsWith("3")); // true
        System.out.println(str1.endsWith("3@")); // false
        // removes spaces from front and back
        System.out.println(str1.trim());
        String str2 = "Macbook is the product of Apple";
        // "Macbook is the product of Apple"
        // 3, 5 = bo, it is not gonna include 5th index
        // result is bo
        System.out.println(str2.substring(3,5));
        // result is book i
        System.out.println(str2.substring(3,9));
        // result is "k "
        System.out.println(str2.substring(6,8));
        // starts from 3 till the end
        // result is book is the product of Apple
        System.out.println(str2.substring(3));
        String word1 = "MACBOOK";
        String word2 = "macbook";
        System.out.println(word1.equalsIgnoreCase(word2));
    }
}
