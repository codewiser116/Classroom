package Day42.university;

public class Main4 {
    public static void main(String[] args) {
        University university = new University();
        Student student1 = new Student(1, "Jake");
        university.addStudent(student1);
        System.out.println(university.getStudents().size());
        university.findStudentById(2);
        university.deleteById(20);
    }
}
