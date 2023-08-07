package Day37;

public class BMW extends Car{

    public BMW(String brand, String engine, String motor, int wheels, int power) {
        super(brand, engine, motor, wheels, power);
    }

    @Override
    public void start() {
        System.out.println("BMW starts!");
    }
}
