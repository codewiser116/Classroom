package Day15WhileLoop;

import java.util.Scanner;

public class RecapSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
//        int number = scanner.nextInt();
//        int counter = 0;
//        for(int i = 1; i <= number; i++){
//            if(number%i==0){
//                counter++;
//            }
//        }
//        if(counter==2){
//            System.out.println(number + " is a prime number");
//        }
//        else{
//            System.out.println(number+" is not a prime number");
//        }

        // 2
        // 456
        // 0 -> 4
        // 1 -> 5
        // 2 -> 6

        //str.substring(0,0+1);
//        String number = "19347";
//        int sum = 0;
//        for(int i = 0; i < number.length(); i++){
//            String stringDigit = number.substring(i, i+1);
//            int digit = Integer.parseInt(stringDigit);
//            sum += digit;
//        }
//        System.out.println(sum);
//
//        int number = scanner.nextInt();
//        int sum = 0;
//
//        // 12>0, sum+= 12 % 10 = 2
//        // 12/10, 1>0, sum+= 1 % 10 = 3
//        // 1/10, 0>0
//        for(int i = number; i > 0; i/=10){
//            sum+=i%10;
//        }
//        System.out.println(sum);

//        int evens = 0, odds = 0;
//        for(int i = 1; i <= 5; i++){
//            int number = scanner.nextInt();
//            if(number%2==0){
//                evens++;
//            }
//            else{
//                odds++;
//            }
//        }
//        System.out.println(odds+" odds, " + evens + " evens");



        // 15
        // 9
        // 209
        // 19
        // 4
        // 123

        // i = 1
        // i =2
        // i = 3

//        int counter = 0, firstNumber = 0;
//        for(int i = 1; i <= 6; i++){
//            int number = scanner.nextInt();
//            if(i==1){
//                firstNumber = number;
//            }
//            else if(number>firstNumber){
//                counter++;
//            }
//        }
//        System.out.println("There are "+ counter +" numbers larger than "+ firstNumber);




        // 15 -> enter again
        // 29 -> enter again
        // -5 -> -5
//        int number = scanner.nextInt();
//        while(number>=0){
//            System.out.println("Enter number");
//            number = scanner.nextInt();
//        }
//        System.out.println(number);
        // sum = 1
        // i = 1 -> sum*=i; -> 1
        // i = 2 -> sum*=i; -> 2
        // i = 3 -> sum*=i; -> 3
        // ...
        // i =7 -> sum*=i; -> 5040

        int multOfFactorial = 1;

//        for(int i = 1; i <= factorial; i++){
//            multOfFactorial*=i;
//        }
//        System.out.println(multOfFactorial);

        int j = 1;
        while(j <= 5){
            multOfFactorial*=j;
            j++;
        }
        System.out.println(multOfFactorial);
    }
}
