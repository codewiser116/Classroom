package Day42;

import java.io.FileReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String password = scanner.nextLine();

        try{
            if(!email.contains("@")){
                throw new Exception();
            }
            else if(password.length()<10){
                throw new Exception();
            }
            else{
                System.out.println("You're logged in");
            }
        } catch (Exception e) {
            System.out.println("Credentials are wrong");
        }
    }
}
