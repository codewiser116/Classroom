package Day36.school;

public class Teacher extends Person{
    private int salary;

    public Teacher(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public void mySalary(){
        System.out.println(salary);
    }


    @Override
    public void person() {
        System.out.println("Every day I need to track " +
                "performance of my students");
    }

    @Override
    public void myGoalIs() {
        System.out.println("My goal is to graduate 250 students");
    }
}
