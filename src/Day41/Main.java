package Day41;

import Day31.University;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException -> Runtime
//        // FileNotFoundException -> Compile
//        try {
//            FileReader fileReader = new FileReader("/Users/codewiseacademy/Desktop/Zhanarbek/Batch3/Classroom/src/Day41/text.txt");
//            Scanner scanner = new Scanner(fileReader);
//            while(scanner.hasNextLine()){
//                System.out.println(scanner.next());
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File is not found!");
//        }
//        readFile();
        try{
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found exception");
        }

    }

    public static void readFile() {
        try {
            FileReader file = new FileReader("/Users/codewiseacademy/Desktop/Zhanarbek/Batch3/Classroom/src/Day41/text1.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found! " + LocalDateTime.now());
        }
    }


    public static void twoCatchBlocks(){


        try {
            FileReader fileReader = new FileReader("text");
        } catch (FileNotFoundException e) {
            System.out.println("There is ioexception");
        }

    }

}
