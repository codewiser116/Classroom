package Day37.person;

public class Todler implements PersonAble {

    @Override
    public void sleep() {
        System.out.println("Sleep more than 11 hours");
    }

    @Override
    public void eat() {
        System.out.println("Average todler should consume up to 600 kk");
    }
}
