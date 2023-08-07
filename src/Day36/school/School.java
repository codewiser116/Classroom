package Day36.school;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void printStudents(){
        for (Student student : students) {
            student.myId();
            student.myName();
            student.myAge();
            student.myFavoriteSubject();
            student.myFavoriteTeacher();
            student.person();
            student.myGoalIs();
            System.out.println();
        }
    }

    public void printTeachers(){
        for (Teacher teacher : teachers) {
            teacher.myId();
            teacher.myName();
            teacher.myAge();
            teacher.mySalary();
            teacher.person();
            teacher.myGoalIs();
            System.out.println();
        }
    }

    public void findStudent(int id){
        for (Student i : students) {
            if(i.getMyId() == id){
                i.myId();
                i.myName();
                System.out.println();
            }
        }
    }

    public void findStudent(String name){
        for (Student student : students) {
            if(student.getMyName().equals(name)){
                student.myId();
                student.myName();
            }
        }
    }

    public void removeTeacher(int id){
        for (int i = 0; i < teachers.size(); i++){
            if(teachers.get(i).getMyId() == id){
                teachers.remove(i);
                i--;
            }
        }
    }

    public void removeTeacher(String name){
        for (int i = 0; i < teachers.size(); i++){
            if(teachers.get(i).getMyName().equals(name)){
                teachers.remove(i);
                i--;
            }
        }
    }

}
