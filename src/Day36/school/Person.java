package Day36.school;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void myId(){
        System.out.println(id);
    }

    public void myName(){
        System.out.println(name);
    }

    public void myAge(){
        System.out.println(age);
    }

    public void person(){
        System.out.println("I need food to have energy");
    }

    public void myGoalIs(){
        System.out.println("To have a better life");
    }

    public int getMyId(){
        return id;
    }

    public String getMyName(){
        return name;
    }
}
