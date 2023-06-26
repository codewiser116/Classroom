package Day13;

import java.util.Scanner;

public class SessionClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = 5;
        int counter = 0;
        for(int i = 1; i <= students; i++){
            System.out.print(i+" student: ");
            String studentChoice = scanner.nextLine();
            if(studentChoice.equals("yes")){
                counter++;
            }
        }
        System.out.println(counter+" out of " + students +" want to go to picnic");
    }
}
