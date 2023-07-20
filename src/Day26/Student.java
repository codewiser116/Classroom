package Day26;

import java.util.Scanner;

public class Student {

    String fullName;
    int age;
    String major;
    String gender;
    String origin;

    public Student(String fullName, int age, String major,
                   String gender, String origin){
        this.fullName = fullName;
        this.age = age;
        this.major = major;
        this.gender = gender;
        this.origin = origin;
    }

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name");
        this.fullName = scanner.nextLine();
        System.out.println("Enter your age");
        this.age = scanner.nextInt();
//        System.out.println("Enter your major");
//        scanner.nextLine();
//        this.major = scanner.nextLine();
//        System.out.println("Enter your gender");
//        this.gender = scanner.nextLine();
//        System.out.println("Enter your origin");
//        this.origin = scanner.nextLine();
    }

}
