package Day35;

public class BMW extends Car{

    public BMW(){

    }
    public BMW(String brand, int wheels, int year, double price) {
        super(brand, wheels, year, price);
    }

    public void run(){
        System.out.println("BMW runs in 1 second");
    }


}
