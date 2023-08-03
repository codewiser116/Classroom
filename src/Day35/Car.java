package Day35;

public class Car {
    String brand;
    int wheels;
    int year;
    double price;

    public Car(){

    }

    public Car(String brand, int wheels, int year, double price){
        this.brand = brand;
        this.wheels = wheels;
        this.year = year;
        this.price = price;
    }

    public Car(String brand, int wheels, int year){
        this.brand = brand;
        this.wheels = wheels;
        this.year = year;
    }

    public void maxSpeed(){
        System.out.println("Average maxspeed for cars is 150");
    }

    public void run(){
        System.out.println("Car runs!");
    }

    public void printBrand(String question){
        System.out.println("First method");
        System.out.println(brand);
    }

    public void printBrand(int question){
        System.out.println("Second method");
        System.out.println(brand);
    }

    public void printDetails(){
        System.out.println(brand);
        System.out.println(wheels);
        System.out.println(year);
        System.out.println(price);
    }




}
