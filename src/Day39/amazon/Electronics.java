package Day39.amazon;

public abstract class Electronics extends Item{

    private int memory;

    public Electronics(String name, double price, double rating, int memory) {
        super(name, price, rating);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}
