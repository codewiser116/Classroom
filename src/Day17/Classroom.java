package Day17;

import java.util.Random;
import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {

        // a -> It is a vowel
        // b -> It is not
        // vowel -> a, e, i, o, u
        // a
        // b
        // c
        // d
        // e
//        for(int i = 97; i<=97+25; i++){
//            if(i == 'a' || i == 'e'
//            || i == 'i' || i == 'o'
//            || i == 'u'){
//                System.out.println((char)i +" is a vowel");
//            }
//            else if(i == 'b' || i == 'c' || i == 'd'){
//                System.out.println((char)i +" it is ok for this letter");
//            }
//            else{
//                break;
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        int counter = 0;
//        int secretNumber = random.nextInt(1,11);
//        System.out.println(secretNumber);
//        while(true){
//            int number = scanner.nextInt();
//            counter++;
//            if(number==secretNumber && counter < 5){
//                System.out.println("Congratulation, you guessed "+ secretNumber);
//                System.out.println("You won 100$");
//                break;
//            }
//            else if(number==secretNumber){
//                System.out.println("Congratulation, you guessed "+ secretNumber);
//                break;
//            }
//            else if(counter==8){
//                System.out.println("Game is over");
//                System.out.println("Secret number was " + secretNumber);
//                break;
//            }
//                System.out.println("Try again");
//        }

//        int smallestNumber = 0, greatestNumber = 0, sum = 0;
//        double average = 0;
//        for(int i = 1; i <= 5; i++){
//            int number = scanner.nextInt();
//            sum+=number;
//            if(number<smallestNumber || i == 1){
//                smallestNumber = number;
//            }
//            if(number>greatestNumber || i == 1){
//                greatestNumber = number;
//            }
//        }
//        average = sum/(double)5;
//        System.out.println("Smallest number = "+ smallestNumber);
//        System.out.println("Greatest number = "+greatestNumber);
//        System.out.println("Sum = " +sum);
//        System.out.println("Average = "+average);


//        int greater = 0, less = 0, equal = 0, evens = 0, odds = 0;
//        for(int i = 1; i <= 15; i++){
//            int randomNumber = random.nextInt(50);
//            if(randomNumber>10){
//                greater++;
//            }
//            else if(randomNumber<10){
//                less++;
//            }
//            else if(randomNumber == 10){
//                equal++;
//            }
//            if(randomNumber % 2 == 0){
//                evens++;
//            }
//            if(randomNumber%2==1){
//                odds++;
//            }
//            System.out.print(randomNumber+" ");
//        }
//        System.out.println();
//        System.out.println(greater+" numbers are greater than 10");
//        System.out.println(less+" numbers are less than 10");
//        System.out.println(equal+" numbers are equal to 10");
//        System.out.println(evens+" evens");
//        System.out.println(odds + " odds");


        int heads = 0, tails = 0;
        int number = scanner.nextInt();
        for(int i = 1; i<=number; i++){
            int randomNumber = random.nextInt(1,3);
            if(randomNumber == 1){
                System.out.println("HEAD");
                heads++;
            }
            else{
                System.out.println("TAIL");
                tails++;
            }
        }
        System.out.println("HEADS = " + heads);
        System.out.println("TAILS = " + tails);











    }
}
