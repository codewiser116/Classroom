package Day10;

import java.util.Scanner;

public class RecapAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        // 1st is the greatest -> done
        // 2nd is the greatest -> done
        // 3rd is the greatest -> done
        // all numbers are the same -> done
        // if 2 numbers are equal -> done
        if(num1>=num2 && num1>=num3){
            System.out.println("First condition: "+num1);
        }
        else if(num2>=num3 && num2>=num1){
            System.out.println("Second condition: "+num2);
        }
        else if(num3 >= num2 && num3 >= num1){
            System.out.println("Third condition: "+num3);
        }

    }
}
