package Day29;

import java.util.ArrayList;
import java.util.Arrays;

public class UniversityMain {
    public static void main(String[] args) {
        Student student1 = new Student("Zak", 23,
                "CS", "MALE", "Australia");
        Student student2 = new Student("Sheyla", 22,
                "CS", "FEMALE","Austria");
        Student student3 = new Student("Mike", 20,
                "BA", "MALE","USA");
        Student student4 = new Student("Bill", 24,
                "Finance", "MALE","USA");

//        student1.myName();
//        student2.myName();
//        student3.myName();
//        student4.myName();

        Student[] studentsArray = {student1, student2,student3,student4};
        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(student1, student2, student3,
                student4));

        Student student5 = new Student("Ashley", 25, "Engineering",
                "FEMALE", "Brazil");

//        studentsArray[4] = student5;
        studentArrayList.add(student5);
        for(int i = 0; i < studentArrayList.size(); i++){
            studentArrayList.get(i).myName();
        }

    }
}
