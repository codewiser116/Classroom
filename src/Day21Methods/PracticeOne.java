package Day21Methods;

public class PracticeOne {
    public static void main(String[] args) {
        helloWorld();
        printString("I love apples");

        printName("Askar");
        printName("Dana");
        printName("Codewise");

        getSum(2, 3);
        getSum(100000, 235235235);
        getSum(-9, 2);

        getLargerInt(3, 1);
        getLargerInt(3, 7);
        int result = getLargerInt(7, 7);





        boolean b = verifyAge(30);
        System.out.println("The value of b: " + b);

        String word = toUpperCase("watermelon");
        System.out.println(word);



        printIfEvenOdd(5); //odd
        printIfEvenOdd(500); //even

        double d2 = findAverage(3,5,6);
        double d1 = findAverage(-9999, 32323, 0);
        double d3 = findAverage(0, 0, 0);


        printReversedString("I am so good at coding");
        printReversedString("You can be even better!");






    }


    public static boolean verifyAge(int age){
        if (age >= 21){
            System.out.println("Great, you can use the application");
            return true;
        }else{
            System.out.println("Sorry, you are too young");
            return false;
        }

    }

    /*
    1. write a method which prints Hello World
     */
    public static void helloWorld(){
        System.out.println("Hello World");
    }

    /*
    2. write a method which takes String as parameter
    and prints it
     */
    public static void printString(String a){
        System.out.println(a);
    }

    /*
    3. write a method which takes String name as parameter
    and prints Hello + name
     */
    public static void printName(String name){
        System.out.println("Hello " + name);
    }

    /*
    4. Write a method that takes two integers as parameters,
    prints their sum and returns their sum.
     */
    public static int getSum(int a, int b){
        System.out.println(a + b);
        return a + b;
    }

    /*
    5. Write a method that takes two integers as parameters
    and prints and returns the larger one
    if numbers are equal, print and return sum
     */
    public static int getLargerInt(int a, int b){
        if (a > b){
            System.out.println("Irina");
        }else if (b > a){
            System.out.println("coding");
        }


        return 0;
    }

    /*
    6. Write a method that takes a string and
    returns the same string in uppercase.
     */
    public static String toUpperCase(String word){
        return word.toUpperCase();
    }

    /*
    7. Write a method that takes an integer as a parameter and
    prints "Even!" if int is even
    prints "Odd!" if int is odd
     */
    public static void printIfEvenOdd(int a){
        if (a % 2 == 0){
            System.out.println("Even!");
        }else{
            System.out.println("Odd!");
        }
    }

    /*
    8. Write a method that takes three numbers and
    prints:
    Number one: 3
    Number two: 40
    Number three: 2
    Average: 15

    returns the average.
     */

    public static double findAverage(int a, int b, int c){
        System.out.println("Number one: " + a);
        System.out.println("Number two: " + b);
        System.out.println("Number three: " + c);

        double average = (double)(a + b + c) / 3;
        System.out.println("Average: " + average);

        return average;
    }

    /*
    8. Write a method that takes a string as a parameter and
    prints it in reversed order.
     */
    public static void printReversedString(String str){
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }












}
