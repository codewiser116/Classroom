package Day24;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop mac = new Laptop("APPLE",
                "M2 PRO", 32, 1024,
                "Midnight", "16 inch");

        Laptop hp = new Laptop("HP",
                "Intel I-9", 16, 512,
                "Red", "15.6 inch");

        Laptop mac2 = new Laptop("APPLE",
                "M2", 16, 256,
                "Black", "13.6 inch");

        Laptop mac3 = new Laptop("ASUS",
                "Intel I-11", 8, 256,
                "Black", "14.5 inch");

        Laptop[] laptops = {mac, hp, mac2, mac3};
        for(int i = 0; i < laptops.length; i++){
            System.out.println(laptops[i].brand);
        }
    }
}
