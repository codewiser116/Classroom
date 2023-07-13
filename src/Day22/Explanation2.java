package Day22;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Explanation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // print(data)
//        int[] array = new int[5];
//        int[] filledArray = assignValues(array); // [1, 54, 3, 7, 9]
//        manipulate(filledArray);
//        int[] students = new int[5];
//        students[0] = askSomebodyReturn();
//        students[1] = askSomebodyReturn();
//        students[2] = askSomebodyReturn();
//        students[3] = askSomebodyReturn();
//        students[4] = askSomebodyReturn();
//        for(int i = 1 ; i < 20; i++){
//            System.out.println("Explaining a topic");
//        }
//        System.out.println(Arrays.toString(students));
        System.out.println(sum(5,10));
    }

    public static void askSomebody(){
        Random random = new Random();
        System.out.println(random.nextInt(1,35));
    }

    public static int askSomebodyReturn(){
        Random random = new Random();
        int studentNumber = random.nextInt(1,50);
        System.out.println("I ask you a questions "+ studentNumber);
        return  studentNumber;
    }

    // 1st method is to assign values
    // 2nd method is to manipulate elements of array
    // [1, 54, 3, 7, 9]
    public static int[] assignValues(int[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void manipulate(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 5){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static double sum(int a, int b){
        // 5 10
        // 5/10 = 0.5
        // 5
        double sum = (double)a / b;
        return sum * 10;
    }

}
