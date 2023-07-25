package Day29;

public class Student {
    String fullName;
    int age;
    String major;
    String gender;
    String origin;

    public Student(String fullName, int age, String major, String gender,
                   String origin){
        this.fullName = fullName;
        this.age = age;
        this.major = major;
        this.gender = gender;
        this.origin = origin;
    }

    public void myName(){
        System.out.println(fullName);
    }
}
