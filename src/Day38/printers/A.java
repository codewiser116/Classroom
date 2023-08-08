package Day38.printers;

public class A implements Printable{


    public static void main(String[] args) {
        A a = new A();
        a.print();
    }

    @Override
    public void print() {
        System.out.println("Hello");
    }
}
