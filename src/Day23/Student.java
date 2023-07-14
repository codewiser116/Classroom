package Day23;

public class Student {
    String gender;
    String name;
    String major;
    String origin;

    public void read(){
        System.out.println(name + " reads a book");
    }

    public void myDetails(){
        System.out.println("My gender is "+ gender);
        System.out.println("My name is "+ name);
        System.out.println("My major is "+ major);
        System.out.println("My origin is "+ origin);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.gender = "male";
        student1.name = "Alex";
        student1.major = "Computer Science";
        student1.origin = "Brazil";

        Student student2 = new Student();
        student2.gender = "female";
        student2.name = "Sheila";
        student2.major = "Bio Informatics";
        student2.origin = "Spain";

        Student student3 = new Student();
        student3.gender = "male";
        student3.name = "Aila";
        student3.major = "Business Administration";
        student3.origin = "Kazakhstan";

        System.out.println("STUDENT 1");
        student1.myDetails();

        System.out.println("STUDENT 2");
        student2.myDetails();

        System.out.println("STUDENT 3");
        student3.myDetails();
    }
}
