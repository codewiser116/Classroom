package Day37.vehicle;

public class Toyota extends Vehicle{

    public Toyota(int wheels, String brand, int power, int price, int year) {
        super(wheels, brand, power, price, year);
    }

    @Override
    public void fullStart() {
        System.out.println("For Toyota it takes 2 minutes for a full-start");
    }

    @Override
    public void fullStop() {
        System.out.println("For Toyota it takes 13 seconds for a full-stop");
    }
}
