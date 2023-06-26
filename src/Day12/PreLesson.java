package Day12;

import java.util.Scanner;

public class PreLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekDay = "Friday";
        int points = 200;

        if(weekDay.equals("Tuesday")){
            points+=10;
            System.out.println("Today u have got 10 more points");
            System.out.println("You have "+ points);
        }
        else if(weekDay.equals("Friday") && points >= 100){
            System.out.println("Today is Friday, u r able to use your points: "+points);
            System.out.println("Enter amount of points u want to use:");
            int pointsToUse = scanner.nextInt();
            if(pointsToUse>points){
                System.out.println("You don't have enough points: "+ points);
            }
            else{
                points -= pointsToUse;
                System.out.println("You have: "+points +" left in your account");
            }
        }
        else{
            System.out.println("Stay with us!, use your money!");
        }
    }
}
