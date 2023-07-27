package Day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temporary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> str = new ArrayList<>();
        str.add("Alex Lee");
        str.add("National Geographic");
        str.add("Mr Beast");
        str.add("Shark Tank");
        str.add("Pewdiepie");
        int counter = 0;
        String answer = "";
        while(true){

            System.out.println("Choose a channel:");
            int channel = scanner.nextInt(); //

            if(channel == 1){
                System.out.println(str.get(0));
                counter++;
            }
            else if(channel==2){
                System.out.println(str.get(1));
                counter++;
            }
            else if(channel==3){
                System.out.println(str.get(2));
                counter++;
            }
            else if(channel==4){
                System.out.println(str.get(3));
                counter++;
            }
            else if(channel==5){
                System.out.println(str.get(4));
                counter++;
            }
            else {
                System.out.println("Invalid channel");
            }

            System.out.println("Do you wish to stop");
            scanner.nextLine();
            answer = scanner.nextLine();
            if(answer.equals("yes")){
                break;
            }
        }
        System.out.println(counter);
    }
}
