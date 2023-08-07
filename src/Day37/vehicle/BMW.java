package Day37.vehicle;

public class BMW extends Vehicle{

    public BMW(int wheels, String brand, int power, int price, int year) {
        super(wheels, brand, power, price, year);
    }

    @Override
    public void fullStart() {
        System.out.println("For BMW it takes 1 minute for a full-start");
    }

    @Override
    public void fullStop() {
        System.out.println("For BMW it takes 10 seconds for a full-stop");
    }
}
