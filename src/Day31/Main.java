package Day31;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("A",19);
        Student student2 = new Student("B",24);
        Student student3 = new Student("C",22);
        Student student4 = new Student("D",20);
        Student student5 = new Student("Z",25);
        Student student6 = new Student("L",26);
        Student student7 = new Student("R",28);
        Student student8 = new Student("P",30);
        Student student9 = new Student("K",23);
        Student student10 = new Student("E",24);

        University university = new University("University");
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
        university.addStudent(student7);
        university.addStudent(student8);
        university.addStudent(student9);
        university.addStudent(student10);

        System.out.println(university.students.size());
//        university.printStudents();
//        university.findStudentByName("A");
//        university.findStudentByAgeBetween(10,25);
//        university.removeStudentByName("A");
//        university.removeStudentByName("A");
//        System.out.println(university.students.size());
        university.updateStudentByName("A", "Mike");
        university.printStudents();
    }
}
