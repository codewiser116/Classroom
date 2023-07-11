package Day21Methods;

public class IntroToMethods {


    public static int addTwoNumbers(int a, int b){
        return a + b;
    }


    public static int multiplyNumbers(int num1, int potato){
        System.out.println("Given number one is equal to: " + num1);
        System.out.println("And number two is equal to: " + potato);
        System.out.println("When you multiple these two numbers");
        System.out.println("The result will be: " + num1 * potato);
        return num1 * potato;
    }




    public static void main(String[] args) {
        System.out.println(addTwoNumbers(10, 5));

        int sum = addTwoNumbers(1, 20);
        System.out.println(sum);


        int result1 = multiplyNumbers(3523, 43634);
        System.out.println(result1);


        System.out.println(multiplyNumbers(3, 5));
        System.out.println(multiplyNumbers(5, 5457));
        System.out.println(multiplyNumbers(424, 5634));




    }






}
