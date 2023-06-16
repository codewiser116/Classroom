package Day8;


import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String firstPart = word.substring(0, start);
        String secondPart = word.substring(start,end+1).toLowerCase();
        String thirdPart = word.substring(end+1);
        System.out.println(firstPart+secondPart+thirdPart);
    }
}
