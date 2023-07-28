package Day31;

import java.util.ArrayList;

public class University {

    String name;
    ArrayList<Student> students = new ArrayList<>();

    public University(String name){
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void printStudents(){
        for (Student i: students) {
            System.out.println(i.name + " " + i.age);
        }
    }

    public void findStudentByAge(int age){
        for (Student i: students) {
            if(i.age == age){
                System.out.println(i.name + " " + i.age);
            }
        }
    }

    public void findStudentByName(String name){
        for (Student i: students) {
            if(i.name.equals(name)){
                System.out.println(i.name + " " + i.age);
            }
        }
    }

    public void findStudentByAgeBetween(int a1, int b1){
        for (Student student : students) {
            if(student.age >=  a1 && student.age <= b1){
                System.out.println(student.name + " " + student.age);
            }
        }
    }

    public void removeStudentByName(String name){
        for (int i = students.size()-1; i >=0; i--) {
            if(students.get(i).name.equals(name)){
                students.remove(students.get(i));
            }
        }
    }

    public void updateStudentByName(String oldName, String newName){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).name.equals(oldName)){
                students.get(i).name = newName;
            }
        }
    }

}
