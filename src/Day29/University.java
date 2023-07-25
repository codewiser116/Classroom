package Day29;

import java.util.ArrayList;

public class University {
    String name;
    String address;
    int rating;
    int index = 0;

    Student[] studentsArray = new Student[50];

    ArrayList<Student> studentsArrayList = new ArrayList<>();

    public University(String name, String address, int rating){
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public void addStudent(Student student){
        studentsArray[index] = student;
        index++;
    }

    public void addStudentArrayList(Student student){
        studentsArrayList.add(student);
    }

    public static void main(String[] args) {
        University university = new University("Duke University", "2250 Devon",
                27);
        Student student1 = new Student("Zak", 23,
                "CS", "MALE", "Australia");
        Student student2 = new Student("Sheyla", 22,
                "CS", "FEMALE","Austria");
        Student student3 = new Student("Mike", 20,
                "BA", "MALE","USA");
        Student student4 = new Student("Bill", 24,
                "Finance", "MALE","USA");
        university.addStudentArrayList(student1);
        university.addStudentArrayList(student2);
        university.addStudentArrayList(student3);
        university.addStudentArrayList(student4);
    }


}
