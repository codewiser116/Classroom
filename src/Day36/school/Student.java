package Day36.school;

public class Student extends Person{
    private String favoriteSubject;
    private String favoriteTeacher;

    public Student(int id, String name, int age, String favoriteSubject,
                   String favoriteTeacher) {
        super(id, name, age);
        this.favoriteSubject = favoriteSubject;
        this.favoriteTeacher = favoriteTeacher;
    }

    public void myFavoriteSubject(){
        System.out.println(favoriteSubject);
    }

    public void myFavoriteTeacher(){
        System.out.println(favoriteTeacher);
    }


    @Override
    public void person() {
        System.out.println("I want to make my GPA 4.0");
    }

    @Override
    public void myGoalIs(){
        System.out.println("I want to be the best student in the University");
    }
}
