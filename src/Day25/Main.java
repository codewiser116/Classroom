package Day25;

public class Main {
    static int a = 5;
    int b = 10;
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        System.out.println("BEFORE");
        System.out.println(main1.a);
        System.out.println(main2.a);
        main1.a  = 10;
        main2.a = 20;
        System.out.println("AFTER");
        System.out.println(main1.a);
        System.out.println(main2.a);
//        System.out.println("BEFORE");
//        System.out.println(main1.b);
//        System.out.println(main2.b);
//        main1.b = 10;
//        main2.b = 20;
//        System.out.println("AFTER");
//        System.out.println(main1.b);
//        System.out.println(main2.b);
    }
    public static void print(){
        System.out.println("PRINT METHOD");
    }

}
