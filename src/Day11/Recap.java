package Day11;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        //1
//        String hello1 = "Hello World!";
//        String hello2 = "Hello world!";
//        String hello3 = new String("Hello World!");
//        System.out.println(hello1.equals(hello2));

//        String message = "Hello everyone, Let's do Java String exercises";
//        System.out.println(message.charAt(10));
//        System.out.println(message.length());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.toLowerCase());
//        System.out.println(message.charAt(5));

        //2
        String str = "  This is a random string for testing purposes  ";
//        str = str.replace("o","i");
//        System.out.println(str.replace("s","i"));
//        System.out.println(str.replace(" ",""));
//        System.out.println(str.substring(12,18));
//        String reversed = str.substring(12,18).toUpperCase();
//        System.out.println(""+reversed.charAt(5)+reversed.charAt(4)
//        + reversed.charAt(3)+reversed.charAt(2)+reversed.charAt(1)
//        + reversed.charAt(0));

//        String str2 = "kitten";
//        String sub = str2.substring(0,2);
//        System.out.println(sub + str2 + sub);

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String firstPart = str1.substring(str1.length()-1);
        String lastPart = str1.substring(0,1);
        String middle = str1.substring(2,str1.length()-1);

        String result = firstPart.toUpperCase() + middle + lastPart.toLowerCase();

        System.out.println(result);
    }
}
