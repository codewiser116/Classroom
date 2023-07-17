package Day24;

public class Student {
    String name;
    int age;
    double gpa;
    String gender;
    String origin;

    public Student(String name, int age, double gpa, String gender, String origin){
        System.out.println("Object is created!");
    }

    public static void read(){
        System.out.println("Student reads 500 words per minute");
    }

    public void sleep(){
        System.out.println("Student is sleeping");
    }

    public void write(){
        System.out.println("Student is writing");
    }

    public void talk(){
        System.out.println("Student is talking");
    }

    public void eat(){
        System.out.println("Student is eating");
    }


}
