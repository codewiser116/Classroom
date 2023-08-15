package Day42;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
    }


    public static void method1(){
        try{
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println(number/0);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
        }
    }

    public static void method2()  {
        try {
            FileReader reader = new FileReader("text.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public static void method3(){
        try{
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input data type");
        }
    }

    public static void method4(){
        try{
            int[] array = {1,2,3,4,5};
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            System.out.println(array[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds!");
        }
    }

    public static void method5(){
        try{
            String str = "value";
            System.out.println(str.charAt(5));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index out of bounds!");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index  out of bounds!");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Finally block");
        }
    }

}
