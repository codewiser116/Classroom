package Day9;

import java.util.Scanner;

public class Conditionals1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batchNumber = 1;
        if(batchNumber < 4){
            System.out.println("This batch is part of Codewise family");
        }
        else{
            System.out.println("We don't have this batch");
        }

    }
}
