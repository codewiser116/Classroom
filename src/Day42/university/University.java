package Day42.university;

import java.util.ArrayList;

public class University {

    private ArrayList<Student> students = new ArrayList<>();

    // add
    public void addStudent(Student student){
        students.add(student);
    }

    // delete by id
    public void deleteById(int id){
        int counter = 0;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == id){
                counter++;
                students.remove(i);
                i--;
            }
        }
        if(counter==0){
            try {
                throw new StudentNotFoundException("Student with id = " + id + " is not found!");
            }
            catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // find student by id
    public void findStudentById(int id){
        int counter = 0;
        for (Student student : students) {
            if (student.getId() == id) {
                counter++;
                System.out.println(student.getId());
                System.out.println(student.getName());
            }
        }
        if(counter==0){
            try {
                throw new StudentNotFoundException("Student with id = " + id + " is not found!");
            }
            catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
