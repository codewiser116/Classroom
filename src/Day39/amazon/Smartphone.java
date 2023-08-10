package Day39.amazon;

public class Smartphone extends Electronics{
    private int ram;
    private double displaySize;
    private int gpu;

    public Smartphone(String name, double price, double rating, int memory, int ram, double displaySize, int gpu) {
        super(name, price, rating, memory);
        this.ram = ram;
        this.displaySize = displaySize;
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " is starting");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + " is shutting down");
    }
}
