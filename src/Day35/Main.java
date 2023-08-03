package Day35;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW",4, 2023, 60000);
        Toyota toyota = new Toyota("Toyota", 4, 2005, 7000);
        bmw.run();
        toyota.run();

        bmw.printBrand("one");
        bmw.printBrand(1);
    }
}
