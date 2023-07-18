package Day25;

public class Car {

    static int countOfCars;
    String brand;
    double price;


    public static void main(String[] args) {
        Car.convertMilesToKilometers(10);
    }

    public static void convertMilesToKilometers(double miles){
        System.out.println(miles*1.6);
    }

    public void drive(){

    }

    public void runTheCar(){

    }

}
