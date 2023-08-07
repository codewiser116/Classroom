package Day37.vehicle;

public abstract class Vehicle {

    int wheels;
    String brand;
    int power;
    int price;
    int year;

    public Vehicle(int wheels, String brand, int power,
                   int price, int year){
        this.wheels = wheels;
        this.brand = brand;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public abstract void fullStart();

    public abstract void fullStop();

    public void turnRight(){
        System.out.println("Vehicle is turning to the right");
    }

    public void brake(){
        System.out.println("Vehicle is going to stop");
    }


}
