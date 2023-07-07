package Day19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForString = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        String[] gameHistory = new String[size];

        for(int i = 0; i < size; i++){
            System.out.println("Choose your option");
            String option = scannerForString.nextLine();
            String optionComputer = "";
            int computerOptionNumber = random.nextInt(1,4);
            if(computerOptionNumber==1){
                optionComputer = "ROCK";
            }
            else if(computerOptionNumber==2){
                optionComputer = "PAPER";
            }
            else {
                optionComputer = "SCISSORS";
            }
            System.out.println("Computers option " +optionComputer);

            if(option.equals(optionComputer)){
                gameHistory[i] = "DRAW";
            }
            else if(option.equals("PAPER") && optionComputer.equals("ROCK")
            || option.equals("ROCK") && optionComputer.equals("SCISSORS")
            || option.equals("SCISSORS") && optionComputer.equals("PAPER")){
                gameHistory[i] = "USER";
            }
            else{
                gameHistory[i] = "COMPUTER";
            }
        }
        System.out.println(Arrays.toString(gameHistory));
    }
}
