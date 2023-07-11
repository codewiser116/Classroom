package Day21Methods;

import java.util.Scanner;

public class SessionProblems2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        countDigits(str);
        String str2 = scanner.nextLine();
        countDigits(str2);
    }
    public static void countDigits(String str){
        int counter = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("There are "+ counter + " digits");
    }
}
