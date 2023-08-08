package Day38.printable;

public class TestInterface4 implements Showable{
    @Override
    public void print() {
        System.out.println("hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
//        TestInterface4 testInterface4 = new TestInterface4();
//        testInterface4.print();
//        testInterface4.show();
//        testInterface4.batch3();
        Printable.batch4();
    }
}
