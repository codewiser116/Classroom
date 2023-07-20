package Day26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University("Loyola University"
        ,"339 Devon", 116, 57999);

        while(true){
            Student student = new Student();
            university.addStudent(student);
            System.out.println("Do you wish to stop");
            String answer = scanner.nextLine();
            if(answer.equals("stop")){
                break;
            }
        }
//        Student student = new Student();
//
//        Student student1 = new Student();
//
//        Student student2 = new Student();
//
//        Student student3 = new Student();
//
//        Student student4 = new Student();


//        university.addStudent(student);
//        university.addStudent(student1);
//        university.addStudent(student2);
//        university.addStudent(student3);
//        university.addStudent(student4);
        university.printUniversity();
        university.printStudents();

        university.exam();

        System.out.println("\nEnter a student name to search");
        String lookingFor = scanner.nextLine();
        university.findStudent(lookingFor);

    }
}
