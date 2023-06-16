package Day8;

public class Exercises1 {
    public static void main(String[] args) {
        // 1. Print the last letter
        // Expected output: !
        String message = "This is just an example text!u"; // 30
//        System.out.println(message.charAt( message.length()-1 ));

//        2. print first letter in lowercase
//        Expected output: t
        // 1st way
//        String str1 = message.toLowerCase();
//        System.out.println(str1.charAt(0));
        // 2nd way
        // Batch3ISBest
        // substring(3) = ch3ISBest
//        String str2 = message.substring(0,1);
//        System.out.println(str2.toLowerCase());


        // 3. print last letter in upperCase
        // Expected output: U
//        System.out.println(message.toUpperCase().charAt( message.length() -1 )); // correct
//
//        System.out.println(message.substring(message.length() - 1).toUpperCase()); // correct


//        4. print last 4 letters using String method
//        Expected output: xt!u
//        Expected output: xtu
//        // 4.1
//        String str4 = message.substring(  26  );
//        System.out.println(str4);
//
//        // 4.2 1st way
//        String result = str4.substring(0,2)  + str4.charAt(str4.length() - 1);
//        System.out.println(result);
//
//        // 4.2 2nd way
//        System.out.println(str4.replace("!",""));

        // 5.
        String message2 = "1This is just an example text!ur"; // 30
        // Print the message without first and last 2 letters
        // There must be at least 4 letters
        // Expected output: is is just an example text

        System.out.println(message2.substring(2, message2.length() - 2));


    }
}
