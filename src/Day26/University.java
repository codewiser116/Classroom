package Day26;


import java.util.Scanner;

public class University {

    String name;
    String address;
    int rating;
    double tuition;
    int index = 0;

    Student[] students = new Student[50];

    public University(String name, String address, int rating,
                      double tuition){
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.tuition = tuition;
    }

    public void addStudent(Student student){
        students[index] = student;
        index++;
    }

    public void exam(){
        for(int i = 0; i < index; i++){
            System.out.println(students[i].fullName + " is taking exam");
        }
    }

    public void printUniversity(){
        System.out.println("University name "+name);
        System.out.println("University address "+address);
        System.out.println("Rating " +rating);
        System.out.println("Tuition "+tuition);
        System.out.println("Number of Students "+index);
    }

    public void printStudents(){
        System.out.println("\nSTUDENTS:");
        for(int i = 0; i < index; i++){
            System.out.println(students[i].fullName);
            System.out.println(students[i].age);
            System.out.println();
        }
        System.out.println();
    }

    public void findStudent(String lookingFor){
        for (int i = 0; i < index; i++){
            if(students[i].fullName.equals(lookingFor)){
                System.out.println("This student studies here");
            }
        }
    }
}
