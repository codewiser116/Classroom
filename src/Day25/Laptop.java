package Day25;

public class Laptop {


    static String browser ;
    int memory = 256;


    public static void main(String[] args) {
        System.out.println("HELLO MAIN");
    }

    static{
        System.out.println("HELLO JAVA");
        browser = "CHROME";
    }

    public static void browser(){
        System.out.println(browser);
    }

    public void someBrowser(){
        browser();

    }

}
