package Day24;

public class Laptop {
    String brand;
    String cpu;
    int ram;
    int memory;
    String color;
    String displaySize;

    public Laptop(String brand, String cpu, int ram, int memory,
                  String color, String displaySize){
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.color = color;
        this.displaySize = displaySize;
    }

    public void printDetails(){
        System.out.println(brand);
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(memory);
        System.out.println(color);
        System.out.println(displaySize);
        System.out.println();
    }
}
