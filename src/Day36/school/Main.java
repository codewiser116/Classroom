package Day36.school;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Teacher1",
                35,12000);
        Teacher teacher2 = new Teacher(4, "Teacher2",
                48, 9000);
        Student student1 = new Student(2, "Student1",
                21, "Math", "Alex");
        Student student2 = new Student(3, "Student2",
                20, "Math","Alex");

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

//        school.printStudents();
        System.out.println();
//        school.printTeachers();
//        school.findStudent(3);
//        school.findStudent("Student1");
        school.removeTeacher(4);
        school.removeTeacher("Teacher1");
        school.printTeachers();
    }
}
