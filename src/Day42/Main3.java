package Day42;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String password = scanner.nextLine();
        try{
            if(!email.contains("@")){
                throw new EmailException("Wrong email");
            }
        }
        catch (EmailException e) {
            System.out.println(e.getMessage());
        }

        try{
            if(password.length()<10){
                throw new PasswordException("Wrong password");
            }
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
