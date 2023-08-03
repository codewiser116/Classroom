package Day35;

public class Toyota extends Car{

    public Toyota(String brand, int wheels, int year, double price) {
        super(brand, wheels, year, price);
    }

    public void run(){
        System.out.println("Toyota runs in 3 seconds");
    }
}
