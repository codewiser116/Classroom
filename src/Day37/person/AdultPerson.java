package Day37.person;

public class AdultPerson implements PersonAble, AdultPersonAble{

    @Override
    public void sleep() {
        System.out.println("Sleep at least 7 hours");
    }

    @Override
    public void eat() {
        System.out.println("Average person should consume from 1500 to 2500 kk");
    }

    @Override
    public void work() {
        System.out.println("Adult person works average 8 hours");
    }

    @Override
    public void drive() {
        System.out.println("Adult person can drive");
    }

    @Override
    public void swim() {
        System.out.println("Average adult person can swim");
    }
}
