package Day24;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Student student3 = new Student();
//
//        student1.name = "Maral";
//        student1.age = 39;
//        student1.gender = "female";
//        student1.origin = "Russia";
//        student1.gpa = 3.55;
//
//        student2.name = "Alex";
//        student2.age = 13;
//        student2.gender = "male";
//        student2.origin = "Brazil";
//        student2.gpa = 2.14;
//
//        student3.name = "Nicolai";
//        student3.age = 18;
//        student3.gender = "male";
//        student3.origin = "USA";
//        student3.gpa = 4.0;
        Student student4 = new Student("Zak",19, 3.5,
                "MALE","Kazakhstan");

        Student student5 = new Student("Kelly", 27, 3.14,
                "FEMALE","Brazil");
        System.out.println(student5.age);

    }
}
