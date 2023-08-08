package Day38.printable;

public interface Printable {

    public static final int a = 5;
    void print();

    default void batch3(){
        System.out.println("Mock interviews");
    }

    static void batch4(){
        System.out.println("Classes start from September");
    }
}
